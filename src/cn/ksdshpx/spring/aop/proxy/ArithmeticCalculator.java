package cn.ksdshpx.spring.aop.proxy;

/**
 * @author peng.x
 * @date 2018年10月11日 下午3:02:36
 */
public interface ArithmeticCalculator {
	public abstract int add(int i, int j);

	public abstract int sub(int i, int j);

	public abstract int mul(int i, int j);

	public abstract int div(int i, int j);
}
