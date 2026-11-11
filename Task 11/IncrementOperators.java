class IncrementOperators{
	public static void main(String []args){
		
		int x = 10;
		System.out.println(x);
	
		x = x + 1;
		System.out.println(x);
		
		x += 1;//(x = 1) x = x + 1
		System.out.println(x);
		
		x++;
		System.out.println(x);		//Post Increment
		
		++x;
		System.out.println(x);		//Pre Increment
		
		System.out.println(++x);
		System.out.println(x++);
		System.out.println(x);
	}
}
