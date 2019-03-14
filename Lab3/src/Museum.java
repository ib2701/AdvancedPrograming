
public class Museum extends Node implements Classifiable,Payable,Visitable {

	String hours;
	int price;
	int rating=0;
	
	Museum (String newName)
	{
		name=newName;
		this.initHours();
		this.initPrice();
	}
	
	@Override
	public void setHours(String newHours) {
		// TODO Auto-generated method stub
		hours=newHours;
	}

	@Override
	public String getHours() {
		// TODO Auto-generated method stub
		return hours;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public void setPrice(int newPrice) {
		// TODO Auto-generated method stub
		price=newPrice;
	}

	@Override
	public void setRating(int newRating) {
		// TODO Auto-generated method stub
		rating=newRating;
	}

	@Override
	public int getRating() {
		// TODO Auto-generated method stub
		return rating;
	}

}
