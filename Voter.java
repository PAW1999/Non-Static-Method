import java.util.Scanner;
/*class  Voter{ // without parameter
	static int age;
	
	static void booleanisEligible(){ // without prameter pasing the value in this program
	Scanner sc=new Scanner(System.in);
		System.out.println("enter age for student :");
	int age = sc.nextInt();
	if(age<=18){// comparing the age to voter eligibale or not for voting 
	System.out.println("Eligible for voting");
	}else{
	System.out.println("your are not eligible");
	}
}
public static void main(String[]args){
	Voter.booleanisEligible();// without paramerter calling the value using staic method 
	}
}*/

// with parameter 
 class Voter{
	 static int age;
	 static void EligibleAge(){
		Scanner sc=new Scanner(System.in);
		System.out.println("read the value from user");
		age=sc.nextInt();
		if(age<=18){
			System.out.println("eligible for voting");
		}
		else{
			System.out.println("Not eligible for voting");
		}
	 }
	 public static void main(String[] args){
	 Voter vc=new Voter();
	 vc.EligibleAge();
 }
 
 }
 
 
 