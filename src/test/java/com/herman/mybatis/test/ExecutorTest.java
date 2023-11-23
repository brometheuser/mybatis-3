package com.herman.mybatis.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.BeforeAll;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/**
 * @BelongsProject: mybatis-3
 * @BelongsPackage: com.herman.mybatis.test
 * @Author: herman
 * @CreateTime: 2023-11-23  20:03:03
 * @Description: TODO
 * @Version: 1.0
 */

public class ExecutorTest {


  @BeforeAll
  public void createSqlSession() throws IOException {
    String configfile = "com/herman/mybatis/test/mybatis-configuration.xml";
    InputStream is = Resources.getResourceAsStream("com/herman/mybatis/test/mybatis-config.xml");
    SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
    SqlSessionFactory factory = builder.build(is);
    SqlSession sqlSession = factory.openSession(true);
    sqlSession.getMapper()

  }


}
