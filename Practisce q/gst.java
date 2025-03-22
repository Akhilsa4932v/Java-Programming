
    import java.util.*;
    // Bill of Items
    public class gst {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    float pencil = sc.nextFloat();
    float pen = sc.nextFloat();
    float eraser = sc.nextFloat();
    float total = pencil + pen + eraser;
    System.out.println("Bill is : " + total);
    //Add on - with 18% tax
    float newTotal = total + (0.18f * total);  //float gst = (sum*18)/100; //gst 18%
    System.out.println("Bill with 18% tax : " + newTotal);
    sc.close();
    }
    }