package Http;

import entity.content;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import service.all;

import java.io.*;

/**
 * HttpGet请求
 * 请求的规则是对应服务端的参数
 */
public class HttpClient {
//    public static void main(String[] args) {
//        content content = new content();
//        all all = new all();
//        //创建httpClientBuilder
//        HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
//        //httpclient
//        CloseableHttpClient closeableHttpClient = httpClientBuilder.build();
//
//
//        HttpGet get = new HttpGet("http://localhost:7116?address=inittest666@126.com&text=123456&title=connectionok");
//
//
////        HttpGet get = new HttpGet(content.getHome() +
////                content.getAddress() +
////                content.getText() +content.getText()+
////                content.getTitle());
//
////        System.out.println(get);
//
//        System.out.println(get.getRequestLine());
//        try {
//            //执行get请求
//            HttpResponse httpResponse = closeableHttpClient.execute(get);
//
//            //获取响应消息实体
//            HttpEntity entity = httpResponse.getEntity();
//
//            httpResponse.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; QQDownload 1.7; .NET CLR 1.1.4322; CIBA; .NET CLR 2.0.50727)");
//
//            //设置响应时间
//            RequestConfig con = RequestConfig.custom().setSocketTimeout(5000).setConnectTimeout(5000)
//                    .setConnectionRequestTimeout(5000).build();
//            get.setConfig(con);
//            //响应状态
//            System.out.println("响应状态：" + httpResponse.getStatusLine());
//
//            //判断响应实体是否为空
//            if (entity != null) {
//                System.out.println("contentEncoding:" + entity.getContentEncoding());
//                System.out.println("response content:" + EntityUtils.toString(entity));
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                //关闭连接释放资源
//                closeableHttpClient.close();
//            } catch (Exception e2) {
//                e2.printStackTrace();
//            }
//        }
//    }
//
//
}