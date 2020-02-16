package epamSoftware.sampleID;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import java.util.Scanner;

public class MainClass
{
	public static void main(String[] args) 
    {
        Gift[] g = new Gift[5];
        g[0] = new Chocs("Twix",30);
        g[1] = new sweets("Rasgulla",10);
        g[2] = new Chocs("Barbone",20);
        g[3] = new sweets("GulabJamun",5);
        g[4] = new Chocs("5Star",15);

        Scanner s = new Scanner(System.in);
        int x = 1;
        System.out.println("1.View Gift Contents\n2.Pack Gift\n");
        while(x!=0)
        {
            System.out.println("Enter choice:");
            x = s.nextInt();
            switch(x)
            {
                case 1: System.out.println("Enter Range");
	                    int l = s.nextInt();
	                    int h = s.nextInt();
	                    int count = 0;
	                    System.out.println("Gifts available in the given quantities are: ");
	                    for (int i = 0; i < 5; i++)
	                    {
	                        if(g[i].getQuantity()>=l && g[i].getQuantity()<=h ) {
	                            System.out.println(g[i].getName());
	                            count++;
	                        }
	                    }
	                    if(count==0)
	                    {
	                        System.out.println("Gift is not packed");
	                    }
	                    System.out.println("Visit Again\n");
	                    break;

                case 2:	System.out.println("Enter the name of gift");
	                    String str = s.next();
	                    int a = 0;
	                    for (int i = 0; i < 5; i++)
	                    {
	                        if(str.toLowerCase().equals(g[i].getName().toLowerCase()))
	                        {
	                            g[i].pack();
	                            a = 1;
	                            break;
	                        }
	                    }
	                    if(a==0){
	                        System.out.println("Gift not found, Choose gift from given list\n");
	                        for (int i = 0; i < 5 ; i++)
	                        {
	                            System.out.println(g[i].getName());
	                            System.out.println(g[i].getQuantity());
	                        }
	                    }
	                    System.out.println("Visit Again!");
	                    break;

                default:System.out.println("Invalid Choice");
                		break;
                
            }
        }
    }
}

