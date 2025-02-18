package seleniumpack;

public class switch1 {

	public static void main(String[] args) {
		char c = '+';
		int a=10 ,b=20;
		switch(c)
		{
		case '+':
			System.out.println("Addition of ="+(a+b));
		break;
		case '-':
			System.out.println("Subtraction of ="+(a-b));
		break;
		case '*':
			System.out.println("Multiplication  of ="+(a*b));
		break;
		case '%':
			System.out.println("Modulo of ="+(a%b));
		break;
		case '/':
			System.out.println("Division of ="+(a/b));
		break;
		default:
			System.out.println("invalid choice");
		}
			

	}

}
