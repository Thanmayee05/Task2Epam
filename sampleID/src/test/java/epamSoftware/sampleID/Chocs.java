package epamSoftware.sampleID;

public class Chocs extends Gift
{
	Chocs(String cname,int weight)
	{
		super(cname,weight);
	}
	void pack()
	{
		System.out.println(this.getName()+" with weight "+this.getQuantity()+" is packing");
	}
}


