import java.util.Scanner;

public class b {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arr = new int[n];
		for(int i=0; i < n; i++){
			arr[i]=input.nextInt();
			if(arr[i] % 2 == 0){
				System.out.println(arr[i]);
			}
		}
	}
}