package Lab1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*	System.out.println("Hello World!");
	String languages[] = {"C" , "C++" , "C#" , "Go" , "JavaScript" , "Pearl" , "PHP" , "Python" , "Swift" , "Java"};
	int n = (int) (Math.random() * 1_000_000);
	n=n*3;
	n=n+0b10101;
	n=n+0xFF;
	n=n*6;
	n=8219772;
	int m=0;
	int c=0;
	
	while(n>10)
	{
	m=n;
	c=0;
	while(m>0)
	{
		c=c+(m%10);
		m=m/10;
	}
	n=c;
	}
	
	System.out.println("Willy-nilly, this semester i will learn " + languages[n]);
	*/
		
	try
	{
	int firstArgument = Integer.parseInt(args[0]);
	System.out.println(firstArgument);
	}
	catch (NumberFormatException e)
	{
		System.out.print("Argument is not an integer");
		System.exit(1);
	}
	
	int firstArgument = Integer.parseInt(args[0]);
	if (firstArgument % 2 == 0) 
	{
		System.out.println("Argument is not odd");
		System.exit(1);
	}
	
	
	int n = firstArgument;
	
	int edges=0;
	int[][]matrix=new int[n][n];
	int i,j;
	
	for(i=0;i<n;i++)
		for(j=0;j<n;j++)
			matrix[i][j]=0;
	
	//complete graph	
	    System.out.println("Complete Graph: ");
		
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				if(i==j)
					matrix[i][j]=0;
				else
				{
					matrix[i][j]=1;
					edges++;
				}
		edges/=2;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
				System.out.print(matrix[i][j]+" ");
			System.out.print("\n");
		}
		System.out.println("The number of edges for the complete graph is "+ edges);
		System.out.println("The minimum degree for the complete graph is "+ (n-1));
		System.out.println("The maximum degree for the complete graph is "+ (n-1));
		System.out.println("The sum of the degrees is equal with 2*m: " + 2*n + "=" + 2*edges);
		System.out.println("The graph is " + (n-1) + "-regular");
		System.out.println();
		
		
	//cycle	
		System.out.println("Cycle");
		edges=0;
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				matrix[i][j]=0;
		for(i=0;i<n;i++)	
		{
			j=i;
			if(j==0)
				matrix[i][n-1]=1;
			else
				matrix[i][j-1]=1;
			if(j==n-1)
				matrix[i][0]=1;
			else
				matrix[i][j+1]=1;
		}	
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				if(matrix[i][j]==1)
					edges++;
		edges/=2;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
				System.out.print(matrix[i][j]+" ");
			System.out.print("\n");
		}
		System.out.println("The number of edges for the cycle is " + edges);
		System.out.println("The minimum degree for the cycle is " + 2);
		System.out.println("The maximum degree for the cycle is " + 2);
		System.out.println("The sum of the degrees is equal with 2*m: " + 2*n + "=" + 2*edges);
		System.out.println("The graph is 2-regular");
		System.out.println();
		
		
		//random graph
		System.out.println("Random Graph");
		edges=0;
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				if(i==j)
					matrix[i][j]=0;
				else
				{
					matrix[i][j]=(int) (Math.random() * 1_000_000)%2;
					matrix[j][i]=matrix[i][j];
					
				}

		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
		if(matrix[i][j]==1)
			edges++;
		
		edges/=2;
		int number, degreeSum=0;
		int minimumDegree=100, maximumDegree=0;
		for(i=0;i<n;i++)
		{
			number=0;
			for(j=0;j<n;j++)
				if(matrix[i][j]==1)
					number++;
			if(number<minimumDegree)
				minimumDegree=number;
			if(number>maximumDegree)
				maximumDegree=number;
			degreeSum+=number;
		}
		System.out.println();
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
				System.out.print(matrix[i][j]+" ");
			System.out.print("\n");
		}
		System.out.println("The number of edges for the random graph is "+ edges);
		System.out.println("The minimum degree for the random graph is "+ minimumDegree);
		System.out.println("The maximum degree for the random graph is "+ maximumDegree);
		if(degreeSum==edges*2) 
		{
			System.out.println("The sum of the degrees is equal with 2*m: " + degreeSum + "=" + edges*2);
		}
		if(minimumDegree == maximumDegree)
		{
			System.out.println("The graph is " + minimumDegree + "-regular");
		}
	     System.out.println("\u03A3");
		//vlad89dc@yahoo.com

}
}
 