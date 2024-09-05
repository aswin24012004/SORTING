package linearsearch;
import java.util.Scanner;
public class LinearSearch {
    static int search(int num,int a[]){
        int n=a.length;
        for(int i=0;i<n;i++){
            if(a[i]== num){
                return i;
            }
        }
       return -1;
    }
public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n=sc.nextInt();
        System.out.println("Enter an Arary Elements : ");
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        } 
        System.out.println("Enter the search Element : ");
        int num=sc.nextInt();
        int x;
        x = search(num,a);
        if(x!=-1) System.out.println("The element is "+x+" Position");
        else  System.out.println("The Element Not Found!!");
    }

    

    
    
}
