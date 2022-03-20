package osgi_servicepublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class ServiceActivator implements BundleActivator {
	
	ServiceRegistration publishServiceRegistration;

	//private static BundleContext context;

	
	//**static BundleContext getContext() {
		//return context;
	//}

	public void start(BundleContext Context) throws Exception {
		//ServiceActivator.context = bundleContext;
		//to notify the publisher has started
		System.out.println("Publisher Start");
		ServicePublish publisherService = new ServicePublishImp();
		
		publishServiceRegistration = Context.registerService(ServicePublish.class.getName(), publisherService, null); 
		
	}

	public void stop(BundleContext Context) throws Exception {
		//ServiceActivator.context = null;
		//to notify the publisher has stopped
		System.out.println("Publisher Stops");
		publishServiceRegistration.unregister();
	}

}
