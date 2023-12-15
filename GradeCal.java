import java.util.Scanner;

    public class GradeCal {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the P C M B marks");
		int P=s.nextInt();
		int C=s.nextInt();
		int M=s.nextInt();
		int B=s.nextInt();
		
		int sum=P+C+M+B;
		System.out.println("Total marks = "+sum);
		double per=sum/4;
		System.out.println("Average Percentage = "+per);
		if(per>=85) {
			System.out.println("Grade = A");
		}
		else if(per>=70 && per<85) 
			System.out.println("Grade = B");
		else if(per>=45 && per<70)
			System.out.println("Grade = C");
		else System.out.println("Grade = F(Fail)");
	}

}
