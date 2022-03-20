package osgi_servivcesubscriber;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import osgi_servicepublisher.ServicePublish;

public class ServiceActivator implements BundleActivator {

	/**private static BundleContext context;
*
*	static BundleContext getContext() {
*		return context;
*	}
*/
	
	ServiceReference<?> serviceReference;
	
	public void start(BundleContext Context) throws Exception {
		//ServiceActivator.context = bundleContext;
		//subscriber begins
		System.out.println("Subscriber Start");
		serviceReference = Context.getServiceReference(ServicePublish.class.getName());
		ServicePublish servicePublish = (ServicePublish)Context.getService(serviceReference);
		System.out.println(servicePublish.publishService());
	}

	public void stop(BundleContext Context) throws Exception {
		//ServiceActivator.context = null;
		System.out.println("Thank You!");
		Context.ungetService(serviceReference);
		
	}

}
