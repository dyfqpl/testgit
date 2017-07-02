package com.twodfire.test;




import static org.junit.Assert.assertEquals;

import org.junit.Test;

import mockit.NonStrictExpectations;
import mockit.Verifications;


public class MyObjectTest {

	@Test
	public void testHello() {
		final MyObject obj=new MyObject();
		new NonStrictExpectations(obj) {
			{
				obj.hello("ZhangSan");
				returns("hello ZhangSan");
				
			}
			
		};
		assertEquals("hello ZhangSan",obj.hello("ZhangSan"));
		new Verifications() {
			{
				obj.hello("ZhangSan");
				times=1;
			}
		};
	}

}
