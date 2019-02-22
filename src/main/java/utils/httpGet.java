package utils;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class httpGet {
    private static String httpGet(String url) {
        try {
            CloseableHttpClient httpclient = HttpClients.createDefault();
            HttpGet httpget = new HttpGet("http：//localhost:7116?address=1563170230&text=testok&title=okoktitle");
            httpget.addHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; QQDownload 1.7; .NET CLR 1.1.4322; CIBA; .NET CLR 2.0.50727)");
            RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(60000).setConnectTimeout(60000).setConnectionRequestTimeout(60000).build();
            httpget.setConfig(requestConfig);
            HttpResponse response = httpclient.execute(httpget);
            HttpEntity entity = response.getEntity();
            String html = EntityUtils.toString(entity);
            httpclient.close();
            return html;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        String url = "http：//localhost:7116?address=1563170230&text=testok&title=okoktitle";
        httpGet(url);
    }
}
