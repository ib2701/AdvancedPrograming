import java.util.ArrayList;

public class Student {
	String name;
	int yearOfStudy;
	ArrayList<Project> preferences = new ArrayList<Project>();

	public Student()
	{
		
	}
	public Student(String name, int yearOfStudy) {
		
		this.name=name;
		this.yearOfStudy=yearOfStudy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getYearOfStudy() {
		return yearOfStudy;
	}

	public void setYearOfStudy(int yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}

	void setPreferences(Project ... args) {
		for(int i=0;i<args.length;i++)
			preferences.add(args[i]);
	}

	public int getNrOfPref() {
		return preferences.size();
	}

	public void viewPreferences() {
		for(int i=0;i<preferences.size();i++)
		{
			System.out.print(preferences.get(i).getName() + " ");
		}
	}
	
	public void addPreferences(Project ... args)
	{
		for(int i=0;i<args.length;i++)
		{
			preferences.add(args[i]);
		}
	}
    }
}
