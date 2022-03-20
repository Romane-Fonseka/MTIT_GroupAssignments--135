package deliverycompanyPublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class DeliveryServiceActivator implements BundleActivator {


	/*public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Start Delivery Publisher Service");
		//DeliveryServiceActivator.context = bundleContext;
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Stopping Delivery Publisher Service");
		//DeliveryServiceActivator.context = null;
	}*/
	
	ServiceRegistration publishSerivceRegisteration;

	public void start(BundleContext bundleContext) throws Exception {
		DeliveryServicePublish deliverypublishService = new DeliveryServicePublishImpl();
		publishSerivceRegisteration = bundleContext.registerService(DeliveryServicePublish.class.getName(), deliverypublishService, null);
		//deliverypublishService.StartDeliveryService();
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Stopping Delivery Publisher Service");
		publishSerivceRegisteration.unregister();
		
	}

}
