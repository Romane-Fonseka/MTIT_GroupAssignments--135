package flowersuplier;

import java.util.Scanner;

public class SuplierServicePublishImpl implements SuplierServicePublish {

	@Override
	public void StartSuplierService() {
		
				
			try {
				
				String Dec="";
				
				int Flowers;
				int FlowerType;
				int FlowerBase;

				Scanner s1= new Scanner (System.in);
				Flowers=0;
				FlowerType=0;
				FlowerBase=0;
				System.out.println("Welcome To Flower Price Calculator");
				System.out.print("Please Enter The Number Of Flowers Needed :-");
				Flowers=s1.nextInt();
				System.out.print("PLease Select Either Rose[1]-RS.100 , SunFlower[2]-Rs.200 or Araliya[3]-Rs.300 :- ");
				FlowerType=s1.nextInt();
				if(FlowerType == 1) {	
					FlowerBase=100;
				}else if (FlowerType == 2) {
					FlowerBase=200;		
				}else if (FlowerType == 3) {
					FlowerBase=300;		
				}else {
					System.out.println("Please Input A Valid Entry");
				}
				SuplierCalc B1= new SuplierCalc(Flowers,FlowerBase);
				B1.CalcSuplier();
			}catch (Exception e) {
				System.out.println("Please Input A Valid Entry");
			}
			
			
		}
		
	

}
