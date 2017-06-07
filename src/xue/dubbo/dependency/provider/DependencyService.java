package xue.dubbo.dependency.provider;

/**
 * 消费端 服务接口 和 生产端的服务接口是一样的
 * @author Administrator
 *
 */
public interface DependencyService {
	
	public String dependency() throws Exception;
}
