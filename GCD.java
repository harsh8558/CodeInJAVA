import java.util.*;
class GCD{
  public static void Solve(int a,int b){
    int gcd = 0;
    if(a>=b && b>0)
    {
      for(int i=1; i<=a; i++){
        if(a%i==0 && b%i==0){
          gcd = i;
        }
      }
    }else{
      for(int i=1; i<=b; i++){
        if(a%i==0 && b%i==0){
          gcd = i;
        }
      }
    }
    System.out.println("GCD: "+gcd);
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    Solve(a,b);
  }
}
