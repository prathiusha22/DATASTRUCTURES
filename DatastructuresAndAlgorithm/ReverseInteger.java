package DatastructuresAndAlgorithm;

public class ReverseInteger {
	
	public static void main(String[] args) {
		
		int num=123;
		int rev=0;
		while(num!=0) {
		  int remainder=num%10;//3
		  rev=rev*10+remainder;//0*10+3=//3
		  num=num/10;//123/10= //12
		}
		System.out.println(rev);
	}

}
