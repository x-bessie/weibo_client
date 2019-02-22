import entity.All;
import entity.BottomLost;
import entity.ScrapyLost;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import service.all;

import java.util.List;

public class test {
    private static all serviceAll;

    @BeforeClass
    public static void setup() {
        serviceAll = new all();

    }

    @AfterClass
    public static void teardown() {
        serviceAll = null;
    }

    @Test
    public void testfindallweibo() {

        List<All> alls = serviceAll.findAllWeibo();

        System.out.println(alls);

//        for (All all : alls) {
//            System.out.println(all);
//        }
    }

    @Test
    public void testqueryScrapy() {
        List<ScrapyLost> scrapys = serviceAll.queryScrapy();
        System.out.println(scrapys);

    }

    @Test
    public void queryBottomLost() {
        List<BottomLost> bottomLosts = serviceAll.queryBottomLost();
        System.out.println(bottomLosts);

    }


    @Test
    public void testUpdateScrapy(){
       serviceAll.updateScrpay();

    }
    @Test
    public void testUpdateBottom(){
        serviceAll.updateBottom();

    }
}