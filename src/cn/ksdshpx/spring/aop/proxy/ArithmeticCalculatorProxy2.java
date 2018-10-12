package cn.ksdshpx.spring.aop.proxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author peng.x
 * @date 2018年10月11日 下午6:32:23
 */
public class ArithmeticCalculatorProxy2 {
	private Object target;

	public ArithmeticCalculatorProxy2(Object target) {
		this.target = target;
	}

	public Object getProxy() throws Exception {
		Class<?> proxyClass = Proxy.getProxyClass(target.getClass().getClassLoader(),
				target.getClass().getInterfaces());
		Constructor<?> con = proxyClass.getDeclaredConstructor(InvocationHandler.class);
		Object proxy = con.newInstance(new InvocationHandler() {

			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("Logging2：The method " + method.getName() + " begin with " + Arrays.asList(args));
				Object result = method.invoke(target, args);
				System.out.println("Logging2：The method " + method.getName() + " ends with :" + result);
				return result;
			}
		});
		return proxy;
	}

	public static void main(String[] args) throws Exception {
		ArithmeticCalculator target = new ArithmeticCalculatorImpl();
		ArithmeticCalculatorProxy2 acp = new ArithmeticCalculatorProxy2(target);
		ArithmeticCalculator proxy = (ArithmeticCalculator) acp.getProxy();
		int result = proxy.sub(3, 4);
		System.out.println("result:" + result);
	}
}
