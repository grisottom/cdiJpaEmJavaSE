package any;

import javax.enterprise.context.ConversationScoped;
import javax.enterprise.inject.Default;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.jboss.solder.core.ExtensionManaged;

@Default
public class EMProducer {

    @ExtensionManaged
    @Produces
    //@ConversationScoped
    @PersistenceUnit (unitName="cdiJpaEmJavaSE")
    EntityManagerFactory emf;
 	   
}
