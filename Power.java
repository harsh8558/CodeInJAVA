import java.util.*;
class Power{
  public static int Solve(int x, int n){
    int pow =1;
    for(int i=1; i<=n; i++){
      pow = pow * x;
    }
    return pow;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int n = sc.nextInt();
    int res = Solve(x,n);
    System.out.println(res);
  }
}
