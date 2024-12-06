/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sorts;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Selection_sort {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        int arr[] = {64,25,12,22,11};
        int j,i;
        int sum = 0;
        
        for(i=0;i<arr.length-1;i++){
            int min = i;
            for(j=i;j<arr.length;j++){
                
                    if(arr[j]<arr[min]){
                        min=j;
                    }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i]=temp;
            
        }
        System.out.print("Assending order :");
         for(i=0;i<arr.length;i++){
             System.out.print(" "+arr[i]);
    }
    
    //==============================================
        System.out.println();
    for(i=0;i<arr.length-1;i++){
            int max = i;
            for(j=i;j<arr.length;j++){
                
                    if(arr[j]>arr[max]){
                        max=j;
                    }
            }
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i]=temp;
            
        }
        System.out.print("Desending order :");
         for(i=0;i<arr.length;i++){
             System.out.print(" "+arr[i]);
    }
         System.out.println();
         
         
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter Your Length Of Array :");
     int n = sc.nextInt();
     int num[]=new int[n];
     
     for(int k=0;k<n;k++){
         System.out.print("Enter Youe Number "+(k+1)+" :");
         num[k]=sc.nextInt();
     }
     
     for(i=0;i<num.length-1;i++){
            int min = i;
            for(j=i;j<num.length;j++){
                
                    if(num[j]<num[min]){
                        min=j;
                    }
            }
            int temp = num[min];
            num[min] = num[i];
            num[i]=temp;
            
        }
        System.out.print("Sort is :");
         for(i=0;i<num.length;i++){
             sum = sum+num[i];
             System.out.print(" "+num[i]);
    }
         System.out.println("Sum is :"+sum);
         
         
         int marks[] = {20, 40, 80, 55, 30};
         System.out.println("Your Array is : (20,40,80,55,30)");
         System.out.print("Enter Value what you need delete:");
         int del=sc.nextInt();
         System.out.println();
         for(i=0;i<marks.length;i++){
             if(del== marks[i]){
                  continue;
             }
             else{
                 
                 System.out.print(" "+marks[i]);
             }
            
    }
         
         
         
    }
   

    
}
