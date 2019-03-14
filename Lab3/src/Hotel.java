
public class Hotel extends Node implements Classifiable{

		int rating=0;

	Hotel(String newName)
	{
		name=newName;
	}
	
	@Override
	public void setRating(int newRating) {
		// TODO Auto-generated method stub
		if(newRating<=5 && newRating>=0)
		{
		rating=newRating;
		}
		else
			System.out.println("Invalid rating, insert a value between 0 and 5");
		
	}

	@Override
	public int getRating() {
		// TODO Auto-generated method stub
		return rating;
	}
	
	

}
