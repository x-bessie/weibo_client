package Http;

import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import service.all;
import utils.setjson;

import java.io.IOException;

public class HttpPostWithJson {
//    public static all serviceAll;


    public static String HttpPostWithJson(String url, String json) {

        String returnValue = "这是默认返回值，接口调用失败";
        CloseableHttpClient httpClient = HttpClients.createDefault();
        ResponseHandler<String> responseHandler = new BasicResponseHandler();
        try {
            //第一步：创建HttpClient对象
            httpClient = HttpClients.createDefault();

            //第二步：创建httpPost对象
            HttpPost httpPost = new HttpPost(url);

            //第三步：给httpPost设置JSON格式的参数
            StringEntity requestEntity = new StringEntity(json, "utf-8");
            requestEntity.setContentEncoding("UTF-8");
            httpPost.setHeader("Content-type", "application/json");
            httpPost.setEntity(requestEntity);

            //第四步：发送HttpPost请求，获取返回值
            returnValue = httpClient.execute(httpPost, responseHandler); //调接口获取返回值时，必须用此方法

            System.out.println("响应状态：" + httpPost.getRequestLine());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                httpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //第五步：处理返回值
        return returnValue;
    }

    public static void main(String[] args) {

        setjson setjson = new setjson();
        all serviceAll = new all();
//        String alljson = setjson.AllJson();  //所有采漏
        String scrapyjson = setjson.ScrapyJson();//采集采漏
        String bottomjson = setjson.BottomJson();//底层
//        HttpPostWithJson("http://localhost:7116?address=inittest666@126.com", alljson);

        if (scrapyjson != null && bottomjson != null) {
            HttpPostWithJson("http://localhost:7116?address=inittest666@126.com", scrapyjson);

            System.out.println("-----------发送成功---------");
            serviceAll.updateScrpay();
            System.out.println("-----------数据库值已更新1---------");


            HttpPostWithJson("http://localhost:7116?address=inittest666@126.com", bottomjson);
            System.out.println("-----------发送成功---------");
            serviceAll.updateBottom();
            System.out.println("-----------数据库值已更新2---------");

        }

    }

}
