package yangqi.hotspot.proxy;

import java.lang.reflect.Proxy;

import yangqi.hotspot.classlifecycle.People;

public class ProxyRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PeopleService service=new PeopleServiceImpl();
		
		System.out.println(service.foo1("str1",1));
		
		System.out.println(service.foo1("str2",2)); 
		
		PeopleService proxyService=(PeopleService) Proxy.newProxyInstance(People.class.getClassLoader(), new Class[]{PeopleService.class}, new LogProxy(service));
	
		System.out.println(proxyService.foo1("str1", 1));
		
		System.out.println(proxyService.foo2("str2", 2));
	}

}
