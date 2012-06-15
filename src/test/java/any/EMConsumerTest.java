package any;

import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Test;

public class EMConsumerTest {
	
	@Inject
	EMConsumer emConsumer;
	
	@Test
	public void testDoSomething() {
		System.out.println("*** EMConsumerTest.testDoSomething ");
		Assert.assertTrue(emConsumer.doSomething());
	}
    
}
