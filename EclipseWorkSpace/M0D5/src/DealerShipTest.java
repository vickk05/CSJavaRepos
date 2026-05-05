import java.io.File;


public class DealerShipTest {

	public static void main(String[] args) {
	car1 = car("Toyota", "Corrolla", 23,300.00);
	car2 = car("Honda", "Civic", 20,000.00);
	

 
    
  }
}

    public class car{
    String make;
    String model;
    double price;

    public car(String make, String model, double price) {
    this.make = make;
    this.model = model;
    this.price = price;
    }
    public String getMake() {
    return make;
    }
    public String getModel() {
    return model;
    }
    public double getPrice() {
    return price;
    }
    
    public void setMake(String make) {
    this.make = make;
    }
    public void setModel(String model) {
    this.model = model;
    }
    public double setPrice(double price) {
    this.price = price;	
    }
    public void displayCarDetails();
    
    

    
    
}
    
    
    
    
    
    
    
    
    
    
    
    
    