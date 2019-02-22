package service;

import Mapper.LocalhostMapper;
import entity.All;
import entity.BottomLost;
import entity.ScrapyLost;
import org.apache.ibatis.session.SqlSession;
import utils.LocalhostDB;

import java.util.List;


public class all {

    public List<All> findAllWeibo() {
        SqlSession sqlSession = LocalhostDB.getSession();
        try {
            LocalhostMapper localhostMapper = sqlSession.getMapper(LocalhostMapper.class);
            List<All> data = localhostMapper.findAllWeibo("select * from weibo_all");

//            System.out.println(jsonArray.toString());
            return data;

        } finally {
            sqlSession.close();
        }

    }

    public List<ScrapyLost> queryScrapy() {
        SqlSession sqlSession = LocalhostDB.getSession();
        try {
            LocalhostMapper localhostMapper = sqlSession.getMapper(LocalhostMapper.class);
            List<ScrapyLost> data = localhostMapper.queryScrapyLost("SELECT weibo_scrapy.SID,weibo_all.aUrl,weibo_all.AID\n" +
                    "FROM\n" +
                    "weibo_all\n" +
                    "LEFT JOIN weibo_scrapy ON weibo_all.AID = weibo_scrapy.SID\n" +
                    "WHERE weibo_scrapy.SID is NULL\n" +
                    "AND weibo_all.`status` = 0"

            );
            return data;
        } finally {
            sqlSession.close();
        }

    }

    public List<BottomLost> queryBottomLost() {
        SqlSession sqlSession = LocalhostDB.getSession();
        try {
            LocalhostMapper localhostMapper = sqlSession.getMapper(LocalhostMapper.class);
            List<BottomLost> data = localhostMapper.queryBottomLost("SELECT\n" +
                    "weibo_bottom.BID,\n" +
                    "weibo_all.aUrl,\n" +
                    "weibo_all.AID\n" +
                    "FROM\n" +
                    "weibo_all\n" +
                    "LEFT JOIN weibo_bottom ON weibo_all.AID = weibo_bottom.BID\n" +
                    "WHERE\n" +
                    "weibo_bottom.BID IS NULL\n"+
                    "AND weibo_all.`statuss` = 0"
            );
            return data;
        } finally {
            sqlSession.close();
        }

    }

    public int updateScrpay() {
        SqlSession sqlSession = LocalhostDB.getSession();
        try {
            LocalhostMapper localhostMapper = sqlSession.getMapper(LocalhostMapper.class);
//
            int data = localhostMapper.updateScrapyLost("UPDATE weibo_all\n" +
                    "LEFT  JOIN weibo_scrapy ON weibo_all.AID = weibo_scrapy.SID\n" +
                    "SET weibo_all.`status` = 1\n" +
                    "WHERE\n" +
                    "weibo_scrapy.SID IS NULL");
            sqlSession.commit();

            return 1;
        } finally {
            sqlSession.close();
        }

    }

    public int updateBottom() {
        SqlSession sqlSession = LocalhostDB.getSession();
        try {
            LocalhostMapper localhostMapper = sqlSession.getMapper(LocalhostMapper.class);
//
            int data = localhostMapper.updateScrapyLost("UPDATE weibo_all\n" +
                    "LEFT  JOIN weibo_bottom ON weibo_all.AID = weibo_bottom.BID\n" +
                    "SET weibo_all.`statuss` = 2\n" +
                    "WHERE\n" +
                    "weibo_bottom.BID IS NULL");
            sqlSession.commit();

            return 1;
        } finally {
            sqlSession.close();
        }

    }

}


