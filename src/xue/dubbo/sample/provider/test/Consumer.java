package xue.dubbo.sample.provider.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import xue.dubbo.sample.provider.SampleService;
public class Consumer {
	
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[]{"sample-consumer.xml"});
		
		SampleService sampleService = (SampleService) context.getBean("sampleService");
		String hellp = sampleService.sayHello("tom");
		
		List list = sampleService.getUsers();
		if(list != null && list.size()>0){
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		}
		
		System.in.read();
	}
}
