package flowersuplier;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class SuplierActivator implements BundleActivator {

	ServiceRegistration publishSerivceRegisteration;

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Start Flower Suplier Publisher Service");
		SuplierServicePublish publishService = new SuplierServicePublishImpl();
		publishSerivceRegisteration = bundleContext.registerService(SuplierServicePublish.class.getName(), publishService, null);
		//publishService.publishService();
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Stopping Flower Suplier Publisher Service");
		publishSerivceRegisteration.unregister();
		
	}

}
