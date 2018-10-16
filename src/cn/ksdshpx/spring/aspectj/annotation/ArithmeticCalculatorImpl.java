package cn.ksdshpx.spring.aspectj.annotation;

import org.springframework.stereotype.Component;

/**
 * @author peng.x
 * @date 2018年10月11日 下午3:03:35
 */
@Component
public class ArithmeticCalculatorImpl implements ArithmeticCalculator {

	@Override
	public int add(int i, int j) {
		int result = i + j;
		return result;
	}

	@Override
	public int sub(int i, int j) {
		int result = i - j;
		return result;
	}

	@Override
	public int mul(int i, int j) {
		int result = i * j;
		return result;
	}

	@Override
	public int div(int i, int j) {
		System.out.println("日志记录：The method div begin with [" + i + "," + j + "]");
		int result = i / j;
		System.out.println("日志记录：The method div ends with :" + result);
		return result;
	}

}