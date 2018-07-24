package exercise;

import java.util.Scanner;

//枚举
public class Enums {
   public enum herotype{
	   TANK,WIZARD,ASSASSIN,ASSIST,WARRIOR,RANGED,PUSH,FARMING,FA;  
   }
   public static void main(String[] args) {
//	   Scanner s = new Scanner(System.in);
	   
	   herotype h = herotype.FA;
//	   System.out.println(h);
//	   h = s.nextInt();
	   switch(h){
		   case TANK:
			   System.out.println("坦客");
			   break;
		   case WIZARD:
			   System.out.println("法师 ");
			   break;
		   case ASSASSIN:
			   System.out.println("刺客");
			   break;
		   case ASSIST:
			   System.out.println("辅助");
			   break;
		   case WARRIOR:
			   System.out.println("近战");
			   break;
			   
		   case RANGED:
			   System.out.println("远程 ");
			   break;
		   case PUSH:
			   System.out.println("推进");
			   break;
		   case FARMING:
			   System.out.println("打野");
			   break;
		   default:
			   System.out.println(".....");
			   break;  
			
	   }
   }
}
