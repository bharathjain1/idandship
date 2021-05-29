package idandship;
import java.util.*;

public class ID_Ship {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the test cases");//Enter the test cases
		int t=sc.nextInt();
		System.out.println("enter the character");//Enter the character value(b,c,d,e)
		for(int a=0;a<t;a++)
		{
			char n=sc.next().charAt(0);
			if(n=='B'||n=='b'){
			System.out.println("BattleShip");//prints battleship if b
        }else if(n=='C'||n=='c'){
            System.out.println("Cruiser");//prints cruiser if c
        }else if(n=='D'||n=='d'){
            System.out.println("Destroyer");//prints destroyer if d
        }else if(n=='F'||n=='f'){
            System.out.println("Frigate");//prints frigate if s
		}
		

	}

}
}


/*
 psuedo code
 1.enter test cases
 2.enter the values
 3.if b its prints battleship
 	if c it prints cruiser
 	if d it prints destroyer
 	if f it prints frigate
 	
 	
 	logic
 	just finding which character is entered and according to it , its printed
 
  
 * */
