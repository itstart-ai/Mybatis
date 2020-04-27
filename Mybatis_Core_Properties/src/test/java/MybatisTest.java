import com.study.mybatis.beans.Dept;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Description:
 * @Author: rands
 * @Date: Created in 10:52 2020/4/26
 * @Modified By:
 */
public class MybatisTest {
    public static void main(String[] args) throws IOException {
        Dept dept = new Dept();
        dept.setDname("测试部4");
        dept.setLoc("湖北武汉");

        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = factory.openSession();
        sqlSession.insert("saveInfo", dept);
        sqlSession.commit();
        sqlSession.close();
    }
}
