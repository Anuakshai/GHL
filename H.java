import java.util.*;
public class H{
  
  public static void main(String []args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int ar1[]=new int[n];
    for(int i=0;i<n;i++)
    ar1[i]=s.nextInt();
    for(int i=0;i<n;i++){
      if(ar1[i]==i)
      System.out.println(ar1[i]);
    }
  }
}