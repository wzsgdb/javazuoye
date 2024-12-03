import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.example.POJO.User;
import org.junit.Test;

import java.io.FileReader;
import java.io.Reader;

public class UserTest {
    @Test
    public void test() {
        String resource ="mybatis-config.xml";
        Reader reader = null;
        try {
            reader = new FileReader(resource);
        }catch (Exception e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = null;
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user =sqlSession.selectOne("User.findById");
        System.out.println(user);
        sqlSession.close();
    }
}
