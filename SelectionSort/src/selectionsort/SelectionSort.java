/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package selectionsort;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author SMIT
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("How many numbers do you wanna sort?");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        
        int[] randomNumbers;
        
        randomNumbers=new int[n];
        
        for (int a=0;a<n;a++){
            System.out.println("Enter a number: ");
            randomNumbers[a]=scan.nextInt();
            
        }
        

        
        for (int i=0;i<n;i++){
            int smallest=randomNumbers[i];
           
            int index=i;
    
            
            for (int j=i;j<n;j++){
                if (randomNumbers[j]<smallest){
                    smallest=randomNumbers[j];
                    index=j;
                }
            }
            int temp=randomNumbers[i];
            randomNumbers[i]=smallest;
            randomNumbers[index]=temp;
            
        }
        System.out.println(Arrays.toString(randomNumbers));
    }
    
}
