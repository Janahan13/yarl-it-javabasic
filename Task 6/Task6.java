//Data Types
//.....Primitive Data Types......//

class Task6{
	public static void main(String []args){
		Byte b1;
		b1 = 12;
		System.out.println("Byte:" +b1);
		
		short s1;
		s1 = 32000;
		System.out.println("Short: "+s1);
		
		int i;
		i = 65022;
		System.out.println("int: "+i);
		
		long l;
		l = 650226558656L;
		System.out.println("long: "+l);
		
		float f1;
		f1 = 25.6f;
		System.out.println("float: "+f1);
		
		double db;
		db = 86.35D;
		System.out.println("Double: "+db);
		
		boolean bool;
		bool = true;
		System.out.println("Boolean: " + bool);
		
		char ch;
		ch = 'A';  
		System.out.println("char: "+ ch);
		
		char ch1;
		ch1 = 65;  //Decimal Value
		System.out.println("Char: "+ ch1);
		
		char ch2;
		ch2 = 0101;   //Octal Value
		System.out.println("Char: "+ch2);
		
		char ch3;
		ch3 = 0x41;  //Hexa Decimal Value
		System.out.println("char: " + ch3);
		
		char ch4;
		ch4 = 0b1000001;  //Binary Value
		System.out.println("Char: "+ch4);
		
		char ch5;
		ch5 = '\u0041'; //Unicode Value
		System.out.println("Char: " + ch5);
		
	}
}