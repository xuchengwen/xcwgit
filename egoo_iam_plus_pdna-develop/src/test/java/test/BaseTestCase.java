package test;

import com.egoonet.springstarter.SpringbootIamApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootIamApplication.class)
@WebAppConfiguration
@Slf4j
public class BaseTestCase {

}