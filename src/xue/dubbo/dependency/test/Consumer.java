package xue.dubbo.dependency.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import xue.dubbo.dependency.provider.DependencyService;

/**
 * 消费者
 * @author Administrator
 *
 */
public class Consumer {
	
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[]{"dependency-consumer.xml"});
		
		context.start();
		
		//获取服务
		DependencyService dependencyService= (DependencyService) context.getBean("dependencyService");
	
		System.out.println(dependencyService.dependency());
		
		System.in.read();
	}
}
