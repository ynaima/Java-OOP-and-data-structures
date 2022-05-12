package week1;



class MyFirst{
    public static void main(String args[]){
     
       
            int input = 7;
            int output = ++input + ++input + ++input;
            System.out.println(output);
       
            int a = 1;
            int b = 2;
            int c;
            int d;
       
            c = ++b;
            d = a++;
       
            c++;
       
            System.out.println("a = " + a);
            System.out.print("b = " + b);
            System.out.println("c = " + c);
            System.out.print("d = " + d);
       

        
    }
}