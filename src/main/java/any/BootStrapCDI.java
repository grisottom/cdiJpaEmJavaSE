package any;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class BootStrapCDI {
	
	public static void main(String[] args) {
		System.out.println(" +++ BootStrapCDI using Weld().initialize ");
		
		WeldContainer weld = new Weld().initialize();
		
		EMConsumer emConsumer = weld.instance().select(EMConsumer.class).get();
		emConsumer.doSomething();
		   
	}

}
