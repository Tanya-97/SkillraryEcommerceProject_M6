package TestNG_Group;

import org.testng.annotations.Test;

public class Sample2 {
	@Test(groups="smoke")
	public void sample2() {
		System.out.println("Hi sample1");
	}
	@Test
	public void sample3() {
		System.out.println("Hi sample3");
	}

}
