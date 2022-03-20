package flowersuplier;

public class SuplierCalc {

	int NumberOfFlowers;
	int BasePrice;
	int Total;
	
	public SuplierCalc(int NoFlowers, int BaseP) {
		this.NumberOfFlowers=NoFlowers;
		this.BasePrice=BaseP;
	}
	public void CalcSuplier() {
		this.Total=this.NumberOfFlowers*this.BasePrice;
		System.out.println("Total Flowers Price For the Selected Options Are :- " + this.Total);
	}
}
