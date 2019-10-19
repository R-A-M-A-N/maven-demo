package TestNGPkg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGExample {
  @Test
  public void LoginByEmail() {
	  System.out.println("Logged in by Email Done...");
	  Assert.assertEquals("Raman", "Raman");
  }
  
  @Test
  public void LoginByFacebook() {
	  System.out.println("Logged in by Facebook Done...");
	  Assert.assertEquals("Raman", "Nitin");
  }
}
