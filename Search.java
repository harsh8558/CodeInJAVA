import java.util.*;
class Search{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt(); 
    }
    System.out.println("ENTER THE ELEMENT TO SEARCH");
    int elem = sc.nextInt();
    int index = 0;
    for(int i=0; i<n; i++){
      if(arr[i]==elem){
        index = i;
      }
    }
    System.out.println("Index="+index);
  }
}