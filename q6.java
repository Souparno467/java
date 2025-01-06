//Author Souparno
class login{
	public static void login(String username,String password){
		switch (username){
			case "ankan":
			 switch(password){
				 case "Madhu":
				   System.out.println("Login Successful!,welcome Ankan");
				   break;
				 case "trisha":
				   System.out.println("Login Successful!,welcome Ankan");
				   break;
				   default:
						System.out.println("Incorrect password");
						break;
			 }
			 break;
			 case "souparno":
			  switch(password){
				  case "Madhu":
				   System.out.println("Login Successful!,welcome Souparno");
				   break;
				   case "trisha":
				   System.out.println("Login Successful!,welcome Souparno");
				   break;
				   default:
						System.out.println("Incorrect password");
						break;
			  }
			  break;
			 default:
				System.out.println("Incorrect Username");
				break;
		}
	}
	public static void main(String[]args){
		if(args.length<2){
			return;
		}
		String username=args[0];
		String password=args[1];
		login(username,password);
	}
}
				   
				   
		