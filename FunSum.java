import java.util.*;
public class FunSum {
  public static void Sum(int a, int b){
    System.out.println("Sum:"+(a+b));
    
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    Sum(a,b);
  }  
}
