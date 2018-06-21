/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_2darrays;

/**
 *
 * @author 尹小姐
 */
import java.util.*;
public class Array_2DArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        String [] test;
//        test = new String[4];
//        test[3]="4";
//        test[2]="3";
//        test[1]="2";
//        test[0]="1";
//        System.out.println(test);
        
                /*
                x,x,x,x,x
                x,x,x,x,x
                x,x,x,x,x
                */
        int b[][]={{1,2,3,4,5},{5,4,3,2,1},{9,8,7,6,5}};//b[row行][column列]
        System.out.println(b[1][0]);//row 1 column 2.
        
        
        
        for(int row = 0; row< b.length; row++){ //Traversing 2D arrays
            for(int column=0; column<b[row].length;column++){  //.length gives num of rows
                System.out.print(b[row][column]+" ");
            }
            System.out.println();
        }
        //output of the codes above
        //1 2 3 4 5 
        //5 4 3 2 1 
        //9 8 7 6 5 
        
        
//        for(int i=0; i<=b.length; i++){
//            for(int k=0; k<=b.length;k++){
//                System.out.print(b[i][k]);
//            }
//            System.out.print("\n");
//        }
//        ArrayList <Integer> a =  new ArrayList();
//        a.add(1);
//        System.out.println(a);
    }
    
}
