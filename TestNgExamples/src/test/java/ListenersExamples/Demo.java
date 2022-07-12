package ListenersExamples;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestListeners.class)
public class Demo {
   @Test
	public void test1() {
		System.out.println("test1():hello am from test1method");
		Assert.assertEquals(3, 2);
	}
   @Test
	public void test2() {
		System.out.println("test2():hello am from test2method");
		Assert.assertEquals(2, 2);
	}

}
