package literals;

public class Literals {

    public static void main(String[] args) {
        /*byte b1=10;
        byte b2=0b1010;
        byte b3=012;
        byte b4=0XA;
        
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);*/
        
        long l=9999999999L;    // this is a long literal, if not specified by default the type becomes a int.
        float f=12.56f;    // this is a float literal if not specified by default the type becomes a double.
        double d=12.56d;   // this is a double literal
         
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
    }
    
}

// output for the sample code above 
/*
9999999999
12.56
12.56
*/
