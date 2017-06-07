package xue.dubbo.direct.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import xue.dubbo.direct.provider.DirectService;

/**
 * ֱ����ʽ��������
 * @author Administrator
 *
 */
public class Consumer {
	
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[]{"direct-consumer.xml"});
		
		context.start();
		
		DirectService directService = (DirectService) context.getBean("directService");
		String direct = directService.direct();
		System.out.println(direct);
		
		System.in.read();
	}
}
