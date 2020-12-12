import io.tangtian.springbean.springbean03.Config3;
import io.tangtian.springbean.springbean03.User3;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author tangtian
 * @version 1.0
 * @className UserTest
 * @description
 * @date 2020/11/16 8:24 AM
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Config3.class})
public class UserTest03 {
    private static final Logger LOG = LoggerFactory.getLogger(UserTest03.class);
    @Autowired
    private User3 user3;

    @Test
    public void testUser(){
        System.out.println(user3.getName());
    }
}
