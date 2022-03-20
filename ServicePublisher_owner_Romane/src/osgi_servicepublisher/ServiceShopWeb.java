/**
 * 
 */
package osgi_servicepublisher;

/**
 * @author USER
 *
 */
public class ServiceShopWeb {
	int NoOfFlowers;
	int price;
	int Total;
	
	public ServiceShopWeb(int NOFlowers, int price, int total) {
		this.NoOfFlowers =NOFlowers;
		this.price = price;
		this.Total = total;
		}
		
		public void ServiceShopWeb(){
			this.Total=this.NoOfFlowers*this.price;
			System.out.println("Total Flowers Price = " + this.Total);
		}
	}


