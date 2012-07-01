package any;

import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import testUtil.WeldJUnit4Runner;

@RunWith(WeldJUnit4Runner.class)
public class EMConsumerTest {
	
	@Inject
	EMConsumer emConsumer;
	
	@Test
	public void testDoSomething() {
		System.out.println("*** EMConsumerTest.testDoSomething ");
		Assert.assertNotNull(emConsumer);
		Assert.assertTrue(emConsumer.doSomething());
	}
    
}
