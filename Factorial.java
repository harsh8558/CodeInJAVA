import java.util.*;
class Factorial {
  public static int Fact(int n){
    int mul = 1;
    for(int i=n; i>=1; i--){
      mul = mul*i;
    }return mul;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int mul = Fact(n);
    System.out.println(mul);
  }  
}
