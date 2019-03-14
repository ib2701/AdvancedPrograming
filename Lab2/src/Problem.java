import java.util.*;

public class Problem {
	ArrayList<Student> Stud = new ArrayList<Student>();
	ArrayList<Project> Prog = new ArrayList<Project>();
	
	public Problem()
	{
		
	}
	
	public void addStudents(Student ... args){
		for(int i=0;i<args.length;i++)
		{
			Stud.add(args[i]);
		}
	}
	
	public void addProjects(Project ... args){
		for(int i=0;i<args.length;i++)
		{
			Prog.add(args[i]);
		}
	}
	
	public void viewProb() {
		for(int i=0;i<Stud.size();i++)
		{
			System.out.print(" (" + Stud.get(i).getName() + " - " + Prog.get(i).getName() + " ) ");
		}
	}
	
}