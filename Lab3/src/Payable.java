
public interface Payable {
       
       int getPrice();
       void setPrice(int newPrice);
       
       default void initPrice()
       {
    	   setPrice(15);
       }
}
