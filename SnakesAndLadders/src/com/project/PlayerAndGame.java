package com.project;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class PlayerAndGame extends GameBoard {
	public static void player(int p) {
		  if(p==1) { 
			  System.out.println("Sorry! you need another player to play the game.");
		  }
	       if(p>4) {
	    	  System.out.println("Inappropriate no.of players");
	      }
	      else {
	    	  Scanner s = new Scanner(System.in);
	    	  String[] str = new String[p];
	    	  int[] in= new int[p];
	    	  for(int i=0;i<p;i++) {    	    
		        System.out.println("Enter the player name...........");
		        str[i]=s.nextLine(); 
		        }   	  
	    	  System.out.println("Hurrayyy!Let's start the game......");
	    	 
	    	  int a = 0,b=0,c=0,d=0;
	    	  
	    	  if(a==100||b==100||c==100||d==100) {
	       		  System.out.println("Bravo!!!!!!......You have won the match");
	       	  }else if(a<100||b<100||c<100||d<100) {
	             while(a<100||b<100||c<100||d<100) {	
	    	  for(int j=0;j<p;j++) {    		   	  
	    		  System.out.println(str[j]+""+" start roll the dice enter roll for roll the dice");
	    		  if(j==0) {
	    			  in[0]=game(p);
	    			  if(a==0&&in[0]!=1) {
	    				  System.out.println("you have to get 1 to start move...");
	    			  }else {
	    			  a=a+in[0];	    			  
	    			  if(a==4||a==9||a==21||a==28||a==51||a==72||a==80) {
	    				  a=ladder(a);
	    			  }else if(a==17||a==62||a==64||a==54||a==93||a==87||a==94||a==98) {
	    				  a=snake(a );
	    			  }
	    			  System.out.println(str[j]+"You are in"+""+a);
	    		  }}if(j==1) {
	    			  in[1]=game(p);
	    			  if(b==0&&in[0]!=1) {
	    				  System.out.println("you have to get 1 to start move...");
	    			  }else {
	    			  b=b+in[1];
	    			  if(b==4||b==9||b==21||b==28||b==51||b==72||b==80) {
	    				  b=ladder(b);
	    			  }else if(b==17||b==62||b==64||b==54||b==93||b==87||b==94||b==98) {
	    				  b=snake(b);
	    			  }
	    			  System.out.println(str[j]+"You are in"+""+b);
	    		  }}if(j==2) {
	    			  in[2]=game(p);
	    			  if(c==0&&in[0]!=1) {
	    				  System.out.println("you have to get 1 to start move...");
	    			  }else {
	    			  c=c+in[2];
	    			  if(c==4||c==9||c==21||c==28||c==51||c==72||c==80) {
	    				  c=ladder(c);
	    			  }else if(c==17||c==62||c==64||c==54||c==93||c==87||c==94||c==98) {
	    				  c=snake(c);
	    			  }
	    			  System.out.println(str[j]+"You are in"+""+c);
	    		  }}if(j==3) {
	    			  in[3]=game(p);
	    			  if(d==0&&in[0]!=1) {
	    				  System.out.println("you have to get 1 to start move...");
	    			  }else {
	    			  d=d+in[3];
	    			  if(d==4||d==9||d==21||d==28||d==51||d==72||d==80) {
	    				  d=ladder(d);
	    			  }else if(d==17||d==62||d==64||d==54||d==93||d==87||d==94||d==98) {
	    				  d=snake(d);
	    			  }
	    			  System.out.println(str[j]+"You are in"+""+d);
	    		  }}
	    	       	  }}
	    	  }}
	    	  
	      }
		public static void main(String[] args) {
	    	  Scanner s = new Scanner(System.in);
	    	  PlayerAndGame p1 = new PlayerAndGame();
	    	  board();
	    	  System.out.println("Instructions:");
	    	  System.out.println("1.The board contains x or o next to certain nos.");
	    	  System.out.println("2.No next to X is snake.No next to o is ladder");
	    	  System.out.println("3.Ladders in:4>14,9>31,21>42,28>84,51>67,72>91,80>91");
	    	  System.out.println("4.Snakes in:17>7,62>19,64>60,54>34,93>73,87>36,94>75,98>79");
	    	  System.out.println("How many players are there? please Enter: 2 or 3 or 4");
	    	  int p = s.nextInt();
	    	  p1.player(p);
	    }

	 }