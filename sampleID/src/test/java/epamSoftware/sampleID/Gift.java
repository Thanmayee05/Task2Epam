package epamSoftware.sampleID;

public abstract class Gift {

	private String gname;
    private int quantity;

    public Gift(String gname, int quantity) 
    {
        this.gname = gname;
        this.quantity = quantity;
    }

    public String getName() {
        return gname;
    }

    public void setName(String gname) {
        this.gname = gname;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    abstract void pack();
}
