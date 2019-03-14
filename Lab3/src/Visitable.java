
public interface Visitable {
	
	
	void setHours(String newHours);
	String getHours();
	
	default void initHours()
	{
		setHours("09:30 - 20:00");
	}
	
	//static Duration get
}
