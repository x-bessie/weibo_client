package Http;


import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.CloseableHttpClient;

import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * HttpPost请求传Json文件
 * 传文件的格式：Content-Type:multipart/form-data
 */
public class HttpPostClient {
    public static void main(String[] args) throws IOException {
        // 文件sTestsetFile：solr_etl_agent35.json是存有JSON字符串的文件
        String sTestsetFile = System.getProperty("user.dir") + File.separator + "testjson.json";
        String sURL = "http://localhost:7116";



        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost uploadFile = new HttpPost(sURL);

        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        builder.addTextBody("field1", "yes", ContentType.TEXT_PLAIN);

        // 把文件加到HTTP的post请求中
        File f = new File(sTestsetFile);
        builder.addBinaryBody(
                "file",
                new FileInputStream(f),
                ContentType.APPLICATION_OCTET_STREAM,
                f.getName()
        );

        HttpEntity multipart = builder.build();
        uploadFile.setEntity(multipart);
        CloseableHttpResponse response = httpClient.execute(uploadFile);
        HttpEntity responseEntity = response.getEntity();
        String sResponse = EntityUtils.toString(responseEntity, "UTF-8");
        System.out.println("Post 返回结果" + sResponse);

    }


}