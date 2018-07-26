package tests;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Logintest {
  @Test
  public void Loginvalid() {
	String  ER = "Tested";
	String  AR = "Tested";
	Assert.assertEquals(AR, ER);
  }
  @Test
  
  public void Logininvalid() {
	  String  ER = "Tested";
		String  AR = "Tested123";
		Assert.assertEquals(AR,ER);
	  
  }
}
