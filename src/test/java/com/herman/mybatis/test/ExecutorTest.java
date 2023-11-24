package com.herman.mybatis.test;

import com.alibaba.fastjson.JSON;
import com.herman.mybatis.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
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

@Slf4j
public class ExecutorTest {


//      try (Reader reader = Resources.getResourceAsReader("org/apache/ibatis/submitted/call_setters_on_nulls_again/mybatis-config.xml")) {
//    sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
//  }

  @BeforeAll
  public void createSqlSession() throws IOException {
    String configfile = "mybatis-configuration.xml";
    InputStream is = Resources.getResourceAsStream(configfile);
    SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
    SqlSessionFactory factory = builder.build(is);
    SqlSession sqlSession = factory.openSession(true);
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    UserEntity user = mapper.findById(1);
    log.info("user{}", JSON.toJSONString(user));
  }

  @Test
  public void test(){


  }


}
