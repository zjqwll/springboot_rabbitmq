package rabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication{ 
    
    public static void main(String[] args) {
      	SpringApplication app = new SpringApplication(SpringbootApplication.class);
		app.setAddCommandLineProperties(false);//屏蔽命令行访问属性的设置
		app.run(args);
    	System.out.println("totoro manage server is started!");
    }
}

