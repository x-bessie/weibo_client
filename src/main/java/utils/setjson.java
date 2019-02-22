package utils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import entity.All;
import entity.BottomLost;
import entity.ScrapyLost;
import service.all;

import java.io.*;
import java.util.List;

/*
 *数据处理 List 转 JSON ,JSON写入文件
 *Author:Lina
 */
public class setjson {

    static all allservice = new all();


    //处理所有url的JSON
    public String AllJson() {
        List<All> weibo = allservice.findAllWeibo();
        JSONArray jsonArray = (JSONArray) JSONArray.toJSON(weibo);
        return jsonArray.toString();
    }

    public String ScrapyJson() {

        List<ScrapyLost> aaa = allservice.queryScrapy();
        JSONArray jsonArray = (JSONArray) JSONObject.toJSON(aaa);
        return jsonArray.toString();
    }

    public String BottomJson() {
        List<BottomLost> bbb = allservice.queryBottomLost();
        JSONArray jsonArray = (JSONArray) JSONObject.toJSON(bbb);
        return jsonArray.toString();

    }


    //JSON写入文件
//    public void writeToJson(String filePath) throws IOException {
//        File file = new File("E:/IdeaProjects/Weibo/testjson.json");
//        char[] stack = new char[1024];
//        int top = -1;
////        String string = objects.toString();
//        String string = Alljson();
//
//        StringBuffer sb = new StringBuffer();
//        char[] charArray = string.toCharArray();
//        for (int i = 0; i < charArray.length; i++) {
//            char c = charArray[i];
//            if ('{' == c || '[' == c) {
//                stack[++top] = c;
//                sb.append("\n" + charArray[i] + "\n");
//                for (int j = 0; j <= top; j++) {
//                    sb.append("\t");
//                }
//                continue;
//            }
//            if ((i + 1) <= (charArray.length - 1)) {
//                char d = charArray[i + 1];
//                if ('}' == d || ']' == d) {
//                    top--;
//                    sb.append(charArray[i] + "\n");
//                    for (int j = 0; j <= top; j++) {
//                        sb.append("\t");
//                    }
//                    continue;
//                }
//            }
//            if (',' == c) {
//                sb.append(charArray[i] + "");
//                for (int j = 0; j <= top; j++) {
//                    sb.append("");
//                }
//                continue;
//            }
//            sb.append(c);
//        }
//        Writer write = new FileWriter(file);
//        write.write(sb.toString());
//        write.flush();
//        write.close();
//    }
}