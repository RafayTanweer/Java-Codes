public class Fibonacci
{
	public static void main(String[]args){
		int n = Integer.parseInt(args[0]);
		int sum = 0;
		int T1 = 0;
		int T2 = 1;
		for (int i = 1 ; i<=n; i++){
			System.out.print(sum + " ");
			sum = T1 + T2;
			T1=T2;
			T2 = sum;		
		}
		
	}
}