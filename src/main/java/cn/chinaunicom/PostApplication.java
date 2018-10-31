package cn.chinaunicom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * **************************************
 * 描述: 主应用入口
 * @ClassName: cn.chinaunicom.OrganizationApplication 
 * @author zuohongwei 
 * @version V1.0
 * **************************************
 */
@EnableScheduling
@EnableTransactionManagement
@SpringBootApplication
public class PostApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostApplication.class, args);
	}
}
