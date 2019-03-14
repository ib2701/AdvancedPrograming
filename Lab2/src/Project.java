import java.time.LocalDate;

public abstract class Project {
	String name;
	LocalDate deadLine;


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDeadLine() {
		return deadLine;
	}
	public void setDeadLine(LocalDate deadLine) {
		this.deadLine = deadLine;
	}
	
	
}
