import java.time.LocalDate;

public class Application extends Project {
	
	public enum Language {
		   JAVA, C, PHP, HTML;
		   };
		   
		Language language;
		
		public Application(String name, LocalDate deadLine, Language language) {
			this.name=name;
			this.deadLine=deadLine;
			this.language=language;
		}

		public Language getLanguage() {
			return language;
		}

		public void setLanguage(Language language) {
			this.language = language;
		}
      
}
