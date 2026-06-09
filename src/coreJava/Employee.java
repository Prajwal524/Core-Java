package coreJava;

public class Employee {
	
		String e_name = "Prajwal Y" ;
		int e_id = 69069;
		String dept = "Tester";
		double salary = 890000;
		long e_phno = 63112224 ;
		String e_mail ="varunbhat04@gmail.com" ;
		
	void company()
	{
		System.out.println(e_name);
		System.out.println(e_id);
		System.out.println(dept);
		System.out.println(salary);
		System.out.println(e_phno);
		System.out.println(e_mail);
		System.out.println(e_name);
	}
		public static void main(String args[]) {
			
			Employee e1 = new Employee();
			Employee e2 = new Employee();
			
			System.out.println(e1.e_name);
			System.out.println(e1.e_id);
			System.out.println(e1.dept);
			System.out.println(e1.salary);
			System.out.println(e1.e_phno);
			System.out.println(e1.e_mail);
			
			System.out.print("\n");
			System.out.print("\n");

			System.out.println(e2.e_name);
			System.out.println(e2.e_id);
			System.out.println(e2.dept);
			System.out.println(e2.salary);
			System.out.println(e2.e_phno);
			System.out.println(e2.e_mail);
			
	}
}
