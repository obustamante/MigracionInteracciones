package co.edu.usc.vision.interacciones.utiles;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class BdUtils {
    static SqlSession sqlSession = null;

    public static SqlSession getSession() throws IOException{

        if(sqlSession == null){
            String resource = "co/edu/usc/vision/interacciones/api/dao/xml/mybatis-config.xml";

            InputStream inputStream = Resources.getResourceAsStream(resource);

            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            sqlSession = sqlSessionFactory.openSession();
        }

        return sqlSession;
    }

    public static void closeSession(){
        if(sqlSession != null){
            sqlSession.close();
            sqlSession = null;
        }
    }

/*  public static BigDecimal getNextValueSeq(String sequenceName) throws IOException{

        SqlSession session = BdUtils.getSession();
        SequenceMapper mapper = session.getMapper( SequenceMapper.class );

        return mapper.getNextValue(sequenceName);
    }
*/

}