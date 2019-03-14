

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hotel v1 = new Hotel("California");
		v1.setRating(5);
		Museum v2 = new Museum("Louvre");
	    Museum v3 = new Museum("British");
	    Church v4 = new Church("Voronet");
	    Church v5 = new Church("Notre_Dame");
	    Restaurant v6 = new Restaurant("KFC");
	    TravelMap map = new TravelMap();
	    map.addNode(v1);
	    map.addNode(v2);
	    map.addNode(v3);
	    map.addNode(v4);
	    map.addNode(v5);
	    map.addNode(v6);
	    map.addEdge(v1, v2, 15);
	    map.addEdge(v1, v3, 10);
	    map.addEdge(v3, v2, 1, false);
	    map.addEdge(v3, v4, 2);
	    map.addEdge(v4, v5, 1);
	    map.addEdge(v5, v6, 1);
	    map.addEdge(v2, v6, 10);
	    v2.setPrice(10);
	    
	    System.out.println("The map is: \n" + map.getNodes()+"\n");  
	    
	    System.out.println(map.toString()+"\n");
	    
	    map.showPriceAvg();
	    
	}

}
