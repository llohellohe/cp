package yangqi.hotspot.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogProxy implements InvocationHandler{
	
	private Object target=null;
	
	public LogProxy(Object target){
		this.target=target;	
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		if(method.getName().equals("foo1")){
			System.out.println("This is foo1() function");
		}
		
		System.out.println("Argument is");	
		
		for(Object arg:args){
			System.out.println(arg);
		}
		
		if(method.getName().equals("foo1")){
			return "Ok";
		}
		return method.invoke(target, args);
	}

	

}
