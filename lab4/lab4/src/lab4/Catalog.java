package lab4;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Catalog extends Graph{

	String path;
	ArrayList<Graph> graphs = new ArrayList<Graph>();
	
	Catalog(String path)
	{
		this.path=path;
	}
	
	public void add(Graph graph) {
		
		graphs.add(graph);
	}

	public void open(String name) {
		
		for (int i = 0; i < graphs.size(); i++) {
			if(graphs.get(i).name==name) {
				
				if (Desktop.isDesktopSupported()) {
				    try {
				        File myFile = new File(path+"\\"+graphs.get(i).image);
				        Desktop.getDesktop().open(myFile);
				    } catch (IOException ex) {
				        // no application registered for PDFs
				    }
				}
			}
		}
	}
	
	public void list() throws FileNotFoundException, IOException {
		
		for (int i = 0; i < graphs.size(); i++) {
			System.out.println(graphs.get(i).name+":");
			try (BufferedReader br = new BufferedReader(new FileReader(path+"\\"+graphs.get(i).definition))) {
				   String line = null;
				   while ((line = br.readLine()) != null) {
				       System.out.println(line);
				   }
				}
			System.out.println();
		}
	}
	

}
