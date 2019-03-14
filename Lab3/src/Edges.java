
public class Edges {
		
	Node capat1;
	Node capat2;
	int cost;
	boolean way;

	public Edges(Node n1, Node n2, int cost, boolean way)
	{
		this.capat1=n1;
		this.capat2=n2;
		this.cost=cost;
		this.way=way;
	}
	
	public Edges(Node n1, Node n2, int cost)
		{
			this.capat1=n1;
			this.capat2=n2;
			this.cost=cost;
			this.way=true;
		}
	 public String getEdge()
	 {
		 
		if(way)
			 return capat1.getName() + " <-" + cost + "-> " + capat2.getName();
		else
			 return capat1.getName() + " -" + cost + "-> " +capat2.getName();
	 }

}
