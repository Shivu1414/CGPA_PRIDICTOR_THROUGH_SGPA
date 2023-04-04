import java.util.Scanner;
public class CGPA_Pridictor_Through_SGPA {
	public static void main(String args[]) {
		Scanner tag=new Scanner(System.in);
		while(true)
		{
		
		System.out.println("Enter 1 if you in 2nd semester");
		System.out.println("Enter 2 if you in 3rd semester");
		System.out.println("Enter 3 if you in 4th semester");
		System.out.println("Enter 4 if you in 5th semester");
		System.out.println("Enter 5 if you in 6th semester");
		System.out.println("Enter 6 if you in 7th semester");
		System.out.println("Enter 7 if you in 8th semester");
		System.out.println("Enter 8 if you are passout");
		int sem=tag.nextInt();
		switch(sem) {
		case 1:
			System.out.print("Enter first semester sgpa =");
			float m=tag.nextFloat();
			System.out.println("SGPA is ="+m);
			System.out.println("Your Percentage ="+(m*10));
			break;
			
		case 2:
			System.out.print("Enter first semester sgpa =");
			float m1=tag.nextFloat();
			System.out.print("Enter second semester sgpa =");
			float m2=tag.nextFloat();
			float sg=(m1+m2)/2;
			System.out.println("SGPA is ="+sg);
			System.out.println("Your Percentage ="+(sg*10));
			break;
			
		case 3:
			System.out.print("Enter first semester sgpa =");
			float n1=tag.nextFloat();
			System.out.print("Enter second semester sgpa =");
			float n2=tag.nextFloat();
			System.out.print("Enter third semester sgpa =");
			float n3=tag.nextFloat();
			float sg1=(n1+n2+n3)/3;
			System.out.println("SGPA is ="+sg1);
			System.out.println("Your Percentage ="+(sg1*10));
			break;
			
		case 4:
			System.out.print("Enter first semester sgpa =");
			float o1=tag.nextFloat();
			System.out.print("Enter second semester sgpa =");
			float o2=tag.nextFloat();
			System.out.print("Enter third semester sgpa =");
			float o3=tag.nextFloat();
			System.out.print("Enter forth semester sgpa =");
			float o4=tag.nextFloat();
			float sg2=(o1+o2+o3+o4)/4;
			System.out.println("SGPA is ="+sg2);
			System.out.println("Your Percentage ="+(sg2*10));
			break;
			
		case 5:
			System.out.print("Enter first semester sgpa =");
			float p1=tag.nextFloat();
			System.out.print("Enter second semester sgpa =");
			float p2=tag.nextFloat();
			System.out.print("Enter third semester sgpa =");
			float p3=tag.nextFloat();
			System.out.print("Enter fourth semester sgpa =");
			float p4=tag.nextFloat();
			System.out.print("Enter fifth semester sgpa =");
			float p5=tag.nextFloat();
			float sg3=(p1+p2+p3+p4+p5)/5;
			System.out.println("SGPA is ="+sg3);
			System.out.println("Your Percentage ="+(sg3*10));
			break;
			
		case 6:
			System.out.print("Enter first semester sgpa =");
			float q1=tag.nextFloat();
			System.out.print("Enter second semester sgpa =");
			float q2=tag.nextFloat();
			System.out.print("Enter third semester sgpa =");
			float q3=tag.nextFloat();
			System.out.print("Enter fourth semester sgpa =");
			float q4=tag.nextFloat();
			System.out.print("Enter fifth semester sgpa =");
			float q5=tag.nextFloat();
			System.out.print("Enter sixth semester sgpa =");
			float q6=tag.nextFloat();
			float sg4=(q1+q2+q3+q4+q5+q6)/6;
			System.out.println("SGPA is ="+sg4);
			System.out.println("Your Percentage ="+(sg4*10));
			break;
			
		case 7:
			System.out.print("Enter first semester sgpa =");
			float r1=tag.nextFloat();
			System.out.print("Enter second semester sgpa =");
			float r2=tag.nextFloat();
			System.out.print("Enter third semester sgpa =");
			float r3=tag.nextFloat();
			System.out.print("Enter fourth semester sgpa =");
			float r4=tag.nextFloat();
			System.out.print("Enter fifth semester sgpa =");
			float r5=tag.nextFloat();
			System.out.print("Enter sixth semester sgpa =");
			float r6=tag.nextFloat();
			System.out.print("Enter seventh semester sgpa =");
			float r7=tag.nextFloat();
			float sg5=(r1+r2+r3+r4+r5+r6+r7)/7;
			System.out.println("SGPA is ="+sg5);
			System.out.println("Your Percentage ="+(sg5*10));
			break;
			
		case 8:
			System.out.print("Enter first semester sgpa =");
			float s1=tag.nextFloat();
			System.out.print("Enter second semester sgpa =");
			float s2=tag.nextFloat();
			System.out.print("Enter third semester sgpa =");
			float s3=tag.nextFloat();
			System.out.print("Enter fourth semester sgpa =");
			float s4=tag.nextFloat();
			System.out.print("Enter fifth semester sgpa =");
			float s5=tag.nextFloat();
			System.out.print("Enter sixth semester sgpa =");
			float s6=tag.nextFloat();
			System.out.print("Enter seventh semester sgpa =");
			float s7=tag.nextFloat();
			System.out.print("Enter Eighth semester sgpa =");
			float s8=tag.nextFloat();
			float sg6=(s1+s2+s3+s4+s5+s6+s7+s8)/8;
			System.out.println("SGPA is ="+sg6);
			System.out.println("Your Percentage ="+(sg6*10));
			break;
		
		
		}
		System.out.println();
		System.out.println();
		
		
		}
	}

}
