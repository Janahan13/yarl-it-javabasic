//If salary > 100000 => 3% tax
//Else => 1% tax
class IfSalary{
	public static void main(String []args){
		int employeeSalary = 50000;
		double tax;
		double netSalary;
		
		System.out.println("Basic Salary : " + employeeSalary);
		
		if(employeeSalary > 100000){
			tax = employeeSalary * 0.03;
		}
		else{
			tax = employeeSalary * 0.01;//tax = 50000 * 0.01   => 500.0
		}
		
		netSalary = employeeSalary - tax;	//
		System.out.println("Tax : " + tax);
		System.out.println("NetSalary : " + netSalary);
	}
}