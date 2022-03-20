package servicesubscriber;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;

import servicepublisher.ServicePublish;
import servicepublisher.ServicePublishImpl;

public class ServiceActivator implements BundleActivator {

	ServiceReference serviceReference;
	
	
	@Override
	public void start(BundleContext context) throws Exception {
		
		System.out.println("Start Account Manager Subscriber Service");
		serviceReference = context.getServiceReference(ServicePublish.class.getName());
		  ServicePublish servicePublish = (ServicePublish) context.getService(serviceReference);
		  System.out.println(servicePublish.publishService());
				  
		
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Stop Account Manager Subscriber Service\nGood Bye !!!");
		context.ungetService(serviceReference);
	}

}
