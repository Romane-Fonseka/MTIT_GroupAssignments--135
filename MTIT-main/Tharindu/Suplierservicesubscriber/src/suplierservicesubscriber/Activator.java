package suplierservicesubscriber;

import flowersuplier.SuplierServicePublish;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class Activator implements BundleActivator {



	ServiceReference serviceReference;

	public void start(BundleContext bundleContext) throws Exception {
		
		try {
			System.out.println("Starting Suplier Service Susbscriber");
			serviceReference= bundleContext.getServiceReference(SuplierServicePublish.class.getName());
			SuplierServicePublish servicePublish= (SuplierServicePublish)bundleContext.getService(serviceReference);
			servicePublish.StartSuplierService();
			
		}catch (Exception e) {
			System.out.println("Please Start Hotel Publisher First");
		}
		
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Stopping Booking Subscriber Service");
		bundleContext.ungetService(serviceReference);
		
	}
}
