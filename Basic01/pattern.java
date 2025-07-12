import java.util.*;
public class pattern {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int income = sc.nextInt();
     int tax; 

    if(income <= 500000) {
      System.out.println("no tax");       
    }
    else if (income <=1000000 && income >= 500000 ) {
        System.out.println(income*0.2);
    }
    else {
        System.out.println(income*0.3);
    }

    }

}
