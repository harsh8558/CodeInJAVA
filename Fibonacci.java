import java.util.*;
public class Fibonacci {
  public static void Solve(int n){
    int a = 0;
    int b = 1;
    int sum = 0;
    System.out.println(a);
    System.out.println(b);
    for(int i=0; i<n; i++){
      sum = a + b;
      a = b;
      b=sum;
      System.out.println(sum);
      
    }
  } 
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Solve(n);
  }
}
