package agentsubsriberservice;

import deliverycompanyPublisher.DeliveryServicePublish;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;


public class AgentServiceActivator implements BundleActivator {
	
	ServiceReference serviceReference;


	public void start(BundleContext bundleContext)  {
		
		try {
			
			serviceReference= bundleContext.getServiceReference(DeliveryServicePublish.class.getName());
			DeliveryServicePublish deliverycompanyPublisher= (DeliveryServicePublish)bundleContext.getService(serviceReference);
			System.out.println("Starting Delivery Agent Service Susbscriber");
			deliverycompanyPublisher.StartDeliveryService();
		}catch (Exception e) {
			System.out.println("Please Start Delivery Service Publisher First");
		}
		
	}


	@Override
	public void stop(BundleContext bundleContext)  
	{

		System.out.println("Stopping Delivery Agent Subscriber Service");
		bundleContext.ungetService(serviceReference);

		
	}


}
