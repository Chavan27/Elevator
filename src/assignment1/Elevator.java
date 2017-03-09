/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment1;

import java.util.Scanner;

/**
 *
 * @author surabhichavan
 */
public class Elevator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
         
        
         int elevator1 = 1; //First elevator is on floor 1
         int elevator2 = 3; //Second elevator is on floor 2
         int elevator3 = 5; //Third elevator is on floor 3
         int elevator4 = 9; //Fourth elevator is on floor 9
   
     
       Scanner input = new Scanner(System.in); 
       
       while (true) {
       
       //Prompting the user to enter the floor they are currently on    
       System.out.println("Entry floor: ");
       int enterfloor = input.nextInt();
       
       //Checking whether the input is valid or no
       if(enterfloor<1 || enterfloor>9) {
           System.out.println("Invalid entry floor");
       } else {
       
           
       double sub1 = enterfloor - elevator1;
       double s1 = Math.abs(sub1);
       double sub2 = enterfloor - elevator2;
       double s2 = Math.abs(sub2);
       double sub3 = enterfloor - elevator3;
       double s3 = Math.abs(sub3);
       double sub4 = enterfloor - elevator4;
       double s4 = Math.abs(sub4);
       
if (s1<=s2 && s1<=s3 && s1<=s4 ) { //Checking if elevator 1 is the nearest
    
    System.out.println("The elevator arriving is \"elevator 1\".");
    
    
    //Showing the elevator coming
    if (enterfloor>=elevator1) { 
        
        for(int i = elevator1 ; i <=enterfloor ; i++)
        {
            System.out.println(i);
            
        }
    } else {
                for(int i = elevator1 ; i>=enterfloor ; i--){
                System.out.println(i);
                }
                }
    
    System.out.println("Destination floor is: ");
    
    int Destfloor = input.nextInt(); //Prompting the user for the destination floor
    
    
    if(Destfloor<1 || Destfloor>9) { //Checking if the destination floor is valid
           System.out.println("Invalid destination floor");
       } else { elevator1 =  Destfloor; }
    

    //Showing the elevator reaching the destination floor
    if (Destfloor>=1 && Destfloor<=9) {
        for(int i=enterfloor; i<=Destfloor; i++) {
        System.out.println(i);
    }
    for(int i=enterfloor; i>=Destfloor; i--) {
        System.out.println(i);
    }
    
    
} }

else if (s2<=s1 && s2<=s3 && s2<=s4 ) { //Checking if elevator 2 is the nearest
    
    
    System.out.println("The elevator arriving is \"elevator 2\".");
    
    
    //Showing the elevator coming
    if (enterfloor>=elevator2) {
        
        for(int i = elevator2 ; i <=enterfloor ; i++)
        {
            System.out.println(i);
            
        }
    } else {
                for(int i = elevator2 ; i>=enterfloor ; i--){
                System.out.println(i);
                }
                }
    
    
    System.out.println("Destination floor is: ");
    
   int Destfloor = input.nextInt(); //Prompting the user for the destination floor
   
    
    if(Destfloor<1 || Destfloor>9) { //Checking if the destination floor is valid
        
           System.out.println("Invalid destination floor");
           
       } else { elevator2 = Destfloor; }
    
    
    //Showing the elevator reaching the destination floor
    if (Destfloor>=1 && Destfloor<=9) {
        
        for(int i=enterfloor; i<=Destfloor; i++) {
            
        System.out.println(i);
    }
    for(int i=enterfloor; i>=Destfloor; i--) {
        
        System.out.println(i);
    }
    }
    
    
} else if(s3<=s1 && s3<=s2 && s3<=s4 ) { //Checking if elevator 3 is the nearest
    
    
    System.out.println("The elevator arriving is \"elevator 3\".");
    
    
    //Showing the elevator coming
    if (enterfloor>=elevator3) {
         
        for(int i = elevator3 ; i <=enterfloor ; i++)
        {
            System.out.println(i);
            
        }
    } else {
                for(int i = elevator3 ; i>=enterfloor ; i--){
                System.out.println(i);
                }
                }
    
    System.out.println("Destination floor is: ");
    
   int Destfloor = input.nextInt(); //Prompting the user for the destination floor
   
    
    if(Destfloor<1 || Destfloor>9) { //Checking if the destination floor is valid
        
           System.out.println("Invalid destination floor");
           
       } else { elevator3 = Destfloor; }
    
    
    
    //Showing the elevator reaching the destination floor
    if (Destfloor>=1 && Destfloor<=9) {
        
        for(int i=enterfloor; i<=Destfloor; i++) {
            
        System.out.println(i);
    }
        for(int i=enterfloor; i>=Destfloor; i--) {
        
        System.out.println(i);
    }
    }
    
    
} else if(s4<=s1 && s4<=s2 && s4<=s3 ) { //Checking if elevator 4 is the nearest
    
    
    System.out.println("The elevator arriving is \"elevator 4\".");
    
    
    //Showing the elevator coming
     if (enterfloor>=elevator4) {
        for(int i = elevator4 ; i <=enterfloor ; i++)
        {
            System.out.println(i);
            
        }
    }
        else {
                for(int i = elevator4 ; i>=enterfloor ; i--){
                System.out.println(i);
                }
                }
    
    System.out.println("Destination floor is: ");
    
           int Destfloor;
           
           Destfloor = input.nextInt(); //Prompting the user for the destination floor
    
    if(Destfloor<1 || Destfloor>9) { //Checking if the destination floor is valid
        
           System.out.println("Invalid destination floor");
           
       } else { elevator4 = Destfloor; }
    
    
    //Showing the elevator reaching the destination floor
    if (Destfloor>=1 && Destfloor<=9) {
        
        for(int i=enterfloor; i<=Destfloor; i++) {
            
        System.out.println(i);
    }
    for(int i=enterfloor; i>=Destfloor; i--) {
        
        System.out.println(i);
    }
    }
}
}
}
        
       }
    }




    
       