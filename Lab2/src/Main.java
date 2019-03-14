import java.time.LocalDate;
import java.time.Month;

import Application.Language;
import Essay.Topic;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Student s1 = new Student("Gigel",3); 
      Student s2 = new Student("Mirel",2);
      Student s3 = new Student("Gigi",1);
      Student s4 = new Student("Gile",4);
      Application a1 = new Application("A1", LocalDate.of(2019, Month.JUNE, 1), Language.JAVA);
      Application a2 = new Application("A2", LocalDate.of(2019, Month.MARCH, 4), Language.PHP);
      Application a3 = new Application("A3", LocalDate.of(2019, Month.APRIL, 4), Language.C);
      Essay e1 = new Essay("E1", LocalDate.parse("2019-06-01"), Topic.ALGORITHMS);
      Essay e2 = new Essay("E2", LocalDate.parse("2019-06-01"), Topic.DATA_STRUCTURES);
      Problem p1 = new Problem();
      p1.addStudents(s1,s2,s3,s4);
      p1.addProjects(a2,e1,a3,e2);
      p1.viewProb();
      
	}

}
