package epamSoftware.sampleID;

public class sweets extends Gift
{
    public sweets(String sname, int squantity) 
    {
        super(sname, squantity);
    }
    void pack()
    {
        System.out.println(this.getName()+" with weight "+this.getQuantity()+" is packed");
	}

}
