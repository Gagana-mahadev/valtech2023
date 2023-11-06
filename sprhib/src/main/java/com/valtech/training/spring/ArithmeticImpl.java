package com.valtech.training.spring;

public class ArithmeticImpl implements Arithmetic {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int sub(int a, int b) {
		return a - b;
	}

	@Override
	public int mul(int a, int b) {
		return a * b;
	}

	@Override
	public int div(int a, int b) throws DivideByZeroException {
		if (b == 0) {
			throw new DivideByZeroException("A number can't be divided by zero");
		}
		return a / b;

	}

	public static void main(String[] args) {
		Arithmetic a = new ArithmeticImpl();
		System.out.println(a.add(2, 3));
		try {
			System.out.println(a.div(5, 0));
		} catch (DivideByZeroException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("will this be seen.....");// this is not executed
		} finally {
			System.out.println("Seen Always");
		}
		System.out.println(a.mul(2, 6));// this will be executed

	}
}
