import java.util.Scanner;
public class EvenorNot {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter size of Array");
		int x = in.nextInt();
		int[] arr = new int[x];
	
		for(int i=0;i<x;i++){
			System.out.println("Enter number");
			int y = in.nextInt();
			arr[i]=y;
			
		}
		
		for(int i = 0; i<x;i++){
			
			if(arr[i] %2== 0){
				System.out.println(arr[i]+" is even");
			}
			else{
				System.out.println(arr[i]+" is odd");
			}
		}
	}

}