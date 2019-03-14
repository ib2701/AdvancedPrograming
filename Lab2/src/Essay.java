import java.time.LocalDate;

public class Essay extends Project {

	public enum Topic {
	    ALGORITHMS, DATA_STRUCTURES, WEB, DATABASES;
	}
	
	Topic topic;
	public Essay(String name, LocalDate deadLine, Topic topic) {
		this.name=name;
		this.deadLine=deadLine;
		this.topic=topic;
	}
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
	
}
