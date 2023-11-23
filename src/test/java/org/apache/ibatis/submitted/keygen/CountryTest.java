package org.apache.ibatis.submitted.keygen;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class CountryTest {


  @Test
  public void test01() throws IOException {

    String xmlPath = "";
    InputStream is = Resources.getResourceAsStream(xmlPath);

    SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
    SqlSessionFactory build = sqlSessionFactoryBuilder.build(is);
    SqlSession sqlSession = build.openSession(false);
    CountryMapper mapper1 = sqlSession.getMapper(CountryMapper.class);
    List<Country> countries = mapper1.findById(1);
    

  }
}
