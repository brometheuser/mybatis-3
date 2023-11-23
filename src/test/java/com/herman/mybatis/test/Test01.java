package com.herman.mybatis.test;

import org.apache.ibatis.executor.BatchExecutor;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.Transaction;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import java.io.IOException;
import java.io.InputStream;

public class Test01 {


  @BeforeAll
  public void createSqlSession() {

    //读取
    try {
      InputStream is = Resources.getResourceAsStream("");
      SqlSessionFactoryBuilder buider = new SqlSessionFactoryBuilder();
      SqlSessionFactory factory = buider.build(is);
      SqlSession sqlSession = factory.openSession(true);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Test
  public void normalExcutor() {

  }

  //

  @Test
  public void resumeExcutor(){

  }

  @Test
  public void batchExcutor() {
    Configuration configuration = null;
    Transaction transaction = null;
    BatchExecutor batchExecutor = new BatchExecutor(configuration, transaction);

  }

}
