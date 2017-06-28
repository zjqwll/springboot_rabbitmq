package rabbitmq.mq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import rabbitmq.SpringbootApplication;

@RunWith(SpringJUnit4ClassRunner.class)
// 指定SpringBoot工程的SpringbootApplication启动类
// 支持web项目
@WebAppConfiguration
@SpringBootTest(classes = SpringbootApplication.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class RabbitMqControllerTests {
	@Autowired
	private RabbitMqTestController rtController;

	@Test
	public void indexServiceTest() {
		String content ="";
		rtController.contractDirect(content);
	}
}
