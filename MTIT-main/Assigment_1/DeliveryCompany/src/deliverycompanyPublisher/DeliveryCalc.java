package deliverycompanyPublisher;

public class DeliveryCalc {

	int BasePrice=0;
	int location=0;
	float DeliveryToatl=0;
	
	public DeliveryCalc(int Type, int location) {
		this.BasePrice=Type;
		this.location=location;
	}
	
	public void CalcDelivery() {
		DeliveryToatl=this.location*this.BasePrice;
		System.out.println("Total Delivery Fee For the Selcted Options Is :- " + this.DeliveryToatl);
	}
}
