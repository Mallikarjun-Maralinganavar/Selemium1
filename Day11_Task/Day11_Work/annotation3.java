package Day11_Work;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotation3 {
  @Test
  public void f() {
	  System.out.println("Test");
  }
	@BeforeClass
	public void as() {
		System.out.println("Before Class 3");
	}
}

class annotation5{
	@Test
	public void f() {
		System.out.println("Test");
	}
	@BeforeClass
	public void as() {
		System.out.println("Before Class 5");
	}
}
class annotation4{
	@Test
	public void f() {
		System.out.println("Test");
	}
	@BeforeClass
	public void as() {
		System.out.println("Before Class 4");
	}
}
class annotation7{
	@Test
	public void f() {
		System.out.println("Test");
	}
	@BeforeClass
	public void as() {
		System.out.println("Before Class 7");
	}
}

