import com.ob.dao.CategoryDao;
import com.ob.service.CategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:conf/applicationContext.xml")
public class test {
    @Autowired
    //因idea检测不到Spring装配的CategoryMapper，需通过此标签声明
    @SuppressWarnings("SpringJavaAutowiringInspection")
    CategoryDao categoryDao;


    @Autowired
    //因idea检测不到Spring装配的CategoryMapper，需通过此标签声明
    @SuppressWarnings("SpringJavaAutowiringInspection")
    CategoryService categoryService;

    //查询
    @Test
    public void List() {
      int  i = categoryDao.listOfMapper();

     System.out.println(i);
    }
}