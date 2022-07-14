package ListenersExamples;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners(TestListeners.class)
public class Demo2 {
   @Test
	public void test3() {
		System.out.println("test3():hello am from test3method");
		Assert.assertEquals(3, 3);
	}
   @Test
	public void test4() {
		System.out.println("test2():hello am from test4method");
		Assert.assertEquals(2, 2);
	}

}
