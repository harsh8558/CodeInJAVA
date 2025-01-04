import java.util.*;
public class RevString {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    String rev = new String(str);
    String result = "";
    for(int i=rev.length()-1; i>=0; i--){
      result = result + rev.charAt(i);
    }
    System.out.println(result);
  }
}
