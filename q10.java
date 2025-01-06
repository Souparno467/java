//Author Souparno
class primeodd{
	public static boolean prime(int num){
		if(num<=1){
			return false;
		}
		for(int i=2;i<=Math.sqrt(num);i++){
			if(num%i==0){
				return false;
			}
		}
		return true;
	}
	public static boolean odd(int num){
		 if(num%2!=0){
			 
		 }
		 return true;
	}
	public static void main(String[]args){
		int number=5;
		if (prime(number)){
			System.out.println(number+"is a prime number");
		}else{
			System.out.println(number+"is not a prime number");
		}
		if(odd(number)){
			System.out.println(number+"is an odd number");
		}else{
			System.out.println(number+"is not an odd number");
		}
	}
}
			