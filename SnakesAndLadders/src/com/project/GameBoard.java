package com.project;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import static com.project.GameBoard.dice;
public class GameBoard {
  public static void board() {
	  for(int i=01;i<=100;i++) {
		  if(i==10||i==20||i==30||i==40||i==50||i==60||i==70||i==80||i==90||i==100) {
			  System.out.println("| "+i+" |");
		  }else if(i==4||i==9||i==21||i==28||i==51||i==72||i==80) {
			  System.out.print("| "+i+" o |");
		  }else if(i==17||i==62||i==64||i==54||i==93||i==87||i==94||i==98) {
			  System.out.print("| "+i+" x |");}
		  else
		   System.out.print("| "+i+" |");
	  }
  } protected static int game(int p) {
	  Scanner s = new Scanner(System.in);
	  int di=0;
	  String g=s.nextLine();
	  if(g.equals("Roll")||g.equals("roll")) {
		  di=dice();
		  System.out.println(di);
	  }else {
		  System.out.println("Please enter roll...");
		  String g1=s.nextLine();
		  if(g1.equals("Roll")||g1.equals("roll")) {
			  di=dice();
			  System.out.println(di);
		  }
	  }
	  System.out.println("Make the move.....Enter the number you get");
	 try { int a=s.nextInt();
	  if(a==di) {
	  return a;}
	  else {
		  return 0;
	  }}
	 catch(InputMismatchException e) {
		 System.out.println("please ensure before give an input");
		 System.out.println();
		 System.out.println("Make the move.....Enter the number you get");
		  int a1=s.nextInt();
		  if(a1==di) {
		  return a1;}
		  else {
			  return 0;
		  }		  
	 }  	 
  } protected static int dice() {
	  Random random = new Random();
	  int x= random.nextInt(1, 6);
	  return x;
}
   protected static int ladder(int i) {
	  if(i==4) {
         return i=14;}
	  else if(i==4) {
	         return i=14;}
	  else if(i==9) {
	         return i=31;}
	  else if(i==21) {
	         return i=42;}
	  else if(i==28) {
	         return i=84;}
	  else if(i==51) {
	         return i=67;}
	  else if(i==72) {
	         return i=91;}
	  return 0;
}
  protected static int snake(int j) {
	if(j==17) {
         return j=7;}
	  else if(j==62) {
	         return j=19;}
	  else if(j==64) {
	         return j=31;}
	  else if(j==54) {
	         return j=34;}
	  else if(j==93) {
	         return j=73;}
	  else if(j==87) {
	         return j=36;}
	  else if(j==94) {
	         return j=75;}
	  else if(j==98) {
		  return j=79;
	  }
	  
     return 0;
}

 }