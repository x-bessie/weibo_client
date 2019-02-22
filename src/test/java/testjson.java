import entity.ScrapyLost;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import service.all;
import utils.setjson;

import java.io.IOException;
import java.util.List;

public class testjson {
    public static setjson setjson;
    private Object ScrapyLost;


    @BeforeClass
    public static void setup() {
        setjson = new setjson();

    }

    @AfterClass
    public static void teardown() {
        setjson = null;
    }


//    @Test
//    public void testjson() throws IOException {
//        setjson.writeToJson("E:/IdeaProjects/Weibo/testjson.json");
//
//    }

//    @Test
//    public void TestJson() {
//        String scrapy = setjson.AllJson();
//
//    }


    @Test
    public void testScrapyJson() {

        String scrapy = setjson.ScrapyJson();

    }
}