
import java.util.ArrayList;
import java.util.Collections;

public class TravelMap {
	
	public ArrayList <Node> nodes=new ArrayList<Node>();
	ArrayList <Edges> edges=new ArrayList<Edges>();
	
	public void addNode(Node v)
	{
		nodes.add(v);
	}
	
	public void addEdge(Node n1, Node n2, int cost, boolean way)
	{
			if(nodes.contains(n1) && nodes.contains(n2))
			{
				Edges edge=new Edges(n1,n2,cost,way);
				edges.add(edge);
			}
			else
			{
				System.out.println("Edge can't be created");
			}
	}

	public void addEdge(Node n1, Node n2, int cost)
	{
			if(nodes.contains(n1) && nodes.contains(n2))
			{
				Edges edge=new Edges(n1,n2,cost);
				edges.add(edge);
			}
			else
			{
				System.out.println("Edge can't be created");
			}
	}

    public String getNodes()
    {
    	ArrayList<String> names = new ArrayList<String>();
    	for(int i=0;i<nodes.size();i++)
    	{
    		names.add(nodes.get(i).getName());
    	}
    	Collections.sort(names);
    	return names.toString();
    }
    

    public String getEdges()
    {
    	ArrayList<String> newEdges = new ArrayList<String>();
    	for(int i=0;i<edges.size();i++)
    	{
  		 newEdges.add(edges.get(i).getEdge());
    	}
    	
    	return newEdges.toString();
    }


	@Override
	public String toString() {
		return "TravelMap nodes=" + this.getNodes() + ", edges=" + this.getEdges();
	}
	
	public void showPriceAvg()
	{
		System.out.println(nodes.stream()
				.filter(l -> l instanceof Payable)
				.mapToDouble(p -> ((Payable) p).getPrice())
				.average()
				.getAsDouble()
				);
	}
}
