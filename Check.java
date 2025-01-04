import java.util.*;
public class Check {
   
  public static void Checking(int n){
    int posi=0;
    int nega=0;
    int zero=0;
    for(int i=1; i<=n; i++){
      Scanner sc = new Scanner(System.in);
      System.out.print("ENTER THE "+i +" NUMBER ");
      int a = sc.nextInt();
      if(a>0){
        posi++;
      }
      else if(a==0){
        zero++;
      }else{
        nega++;
      }
    }
    System.out.println("POSITIVE:"+posi);
    System.out.println("NEGATIVE:"+nega);
    System.out.println("ZEROS:"+zero);
  }
  
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER THE NO Of Numbers");
    int n = sc.nextInt();
    Checking(n);
  }  
}
