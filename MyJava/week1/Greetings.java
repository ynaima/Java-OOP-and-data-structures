package week1;
import java.lang.*;
import java.util.*;

public class Greetings{
    public static void main (String args[]){
    Scanner sc=new Scanner(System.in);

    System.out.println("May I now your name?: ");

    String name;
    int year;
    name = sc.nextLine();
    year = sc.nextInt();
    
    System.out.println("Welcome to " + year + " it is really nice to see you " + name);

    }
}


/* outputs are 
C:\Users\naimo\OneDrive - Wilfrid Laurier University\udemy\MyJava>javac Greetings.java
//C:\Users\naimo\OneDrive - Wilfrid Laurier University\udemy\MyJava>dir
 // in drive C is Acer
 // Serial Number is F4F6-E296

 // of C:\Users\naimo\OneDrive - Wilfrid Laurier University\udemy\MyJava

2022-01-09  12:49 AM    <DIR>          .
2022-01-08  11:15 PM    <DIR>          ..
2022-01-09  12:49 AM             1,143 Greetings.class
2022-01-09  12:49 AM               401 Greetings.java
2022-01-08  11:19 PM               488 MyFirst.class
2022-01-08  11:19 PM               208 MyFirst.java
2022-01-08  11:03 PM               208 MyFirst.txt
2022-01-08  11:24 PM             3,375 notes.txt
2022-01-09  12:24 AM             1,045 ReadKeyboard.class
2022-01-09  12:38 AM             1,233 ReadKeyboard.java
               8 File(s)          8,101 bytes
               2 Dir(s)  164,360,011,776 bytes free

//C:\Users\naimo\OneDrive - Wilfrid Laurier University\udemy\MyJava>//java Greetings
// I now your name?:
//Naima Yasin Mohamed
2022
// to 2022 it is really nice to see you Naima Yasin Mohamed

//C:\Users\naimo\OneDrive - Wilfrid Laurier University\udemy\MyJava> */