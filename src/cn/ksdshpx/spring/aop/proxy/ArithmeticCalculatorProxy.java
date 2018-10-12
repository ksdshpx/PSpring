package cn.ksdshpx.spring.aop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Properties;

/**
 * @author peng.x
 * @date 2018年10月11日 下午6:32:23
 */
public class ArithmeticCalculatorProxy {
	private Object target;

	public ArithmeticCalculatorProxy(Object target) {
		this.target = target;
	}

	public Object getProxy() {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
				new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println(
								"Logging：The method " + method.getName() + " begin with " + Arrays.asList(args));
						Object result = method.invoke(target, args);
						System.out.println("Logging：The method " + method.getName() + " ends with :" + result);
						return result;
					}
				});
	}

	public static void main(String[] args) {
		//将动态生成的代理类保存下来
		Properties properties = System.getProperties();
		properties.put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		ArithmeticCalculator target = new ArithmeticCalculatorImpl();
		ArithmeticCalculatorProxy acp = new ArithmeticCalculatorProxy(target);
		ArithmeticCalculator proxy = (ArithmeticCalculator) acp.getProxy();
		int result = proxy.sub(3, 4);
		System.out.println("result:" + result);
	}
}
