package any;

import java.io.Serializable;

import javax.inject.Inject;
import javax.persistence.EntityManager;

public class EMConsumer implements Serializable {
    
	private static final long serialVersionUID = 1L;

	@Inject
	EntityManager em;
	
	public EMConsumer() {
		System.out.println("*** EMConsumer Bean, default contructor, em injected=" + em);
	}
	
	public Boolean doSomething() {
		System.out.println("*** EMConsumer.doSomething, em injected =" + em);
		
		return (em==null?false:true);
	}
}
