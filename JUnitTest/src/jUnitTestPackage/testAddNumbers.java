package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers
{

	@Test
	public void test()
	{
		jUnitfunctions jUnit = new jUnitfunctions();
		int result = jUnit.addnumber(100,200);
		assertEquals(300,result);
	}

}