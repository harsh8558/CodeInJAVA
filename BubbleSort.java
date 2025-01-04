import java.util.*;
class BubbleSort{
  public static void InsertArr(int n){
    int arr[] = new int[n];
    for(int i=0; i<n; i++){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Elemnt at index "+i);
      arr[i] = sc.nextInt();
    }
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr.length-i-1; j++){
        if(arr[j]>arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i]+" ");
    }
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER THE SIZE OF ARRAY ");
    int n = sc.nextInt();
    InsertArr(n);
  }
}