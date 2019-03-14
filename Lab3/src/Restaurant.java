
public class Restaurant extends Node implements Visitable,Classifiable {

	String hours;
	int rating=0;
	
	Restaurant (String newName)
	{
		name=newName;
		this.initHours();
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
