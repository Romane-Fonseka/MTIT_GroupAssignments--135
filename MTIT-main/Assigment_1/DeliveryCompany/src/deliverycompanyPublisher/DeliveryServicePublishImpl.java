package deliverycompanyPublisher;

import java.util.Scanner;

public class DeliveryServicePublishImpl implements DeliveryServicePublish {

	@Override
	public void StartDeliveryService() {
		
		try {
		
		
			int VeHtYPE=0;
			int BasePrice=0;
			int Attendies=0;
			int location=0;
			
			Scanner s1= new Scanner (System.in);
			VeHtYPE=0;
			BasePrice=0;
			Attendies=0;
			location=0;
			System.out.println("Welcome To Delivery Calculator");
			System.out.print("Please Select Either Bike[1]-RS.2000 , Car[2]-Rs.3000 or Van[3]- Rs.4000 :- ");
			VeHtYPE=s1.nextInt();
			if(VeHtYPE == 1) {
				BasePrice=2000;
			}else if(VeHtYPE == 2) {
				BasePrice=3000;	
			}else if (VeHtYPE == 3) {
				BasePrice=4000;	
			}else {
				System.out.println("Please Input A Valid Entry");
			}
			System.out.print("Please Enter Distance to the location (Km) :- ");
			location=s1.nextInt();
			DeliveryCalc D1= new DeliveryCalc(BasePrice,location);
			D1.CalcDelivery();		
	}catch(Exception e ){
			System.out.print("Please Input A Valid Entry");
			
		}
		
		
		
	}

}
