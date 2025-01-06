//Author Souparno
class username{
	public static int length(String str){
		return str.length();
	}
	public static void main(String[]args){
		if(args.length<3){
			return;
		}
		for(int i=0;i<args.length;i++){
			int length=length(args[i]);
			switch (length){
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
				  System.out.println("Hello"+""+args[i]+""+"Username length is:"+length);
				  break;
				 default:
				   System.out.println("Sorry ,the username is too short");
				   break;
			}
		}
	}
}
				
				