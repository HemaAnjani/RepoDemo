package ExampleSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

		

		public class Client {
				public static void main(String args[]) {
//					
//					EmployeeAddress ea=new EmployeeAddress(); //general java code
//					ea.setEid(110);
//					ea.setEname("Nikii");
//					ea.setAddress("Redwood Shores");
//					
//					System.out.println(ea);
					
					//using IOC
			ApplicationContext context=new ClassPathXmlApplicationContext("EmployeeBean.xml");
			Employee e1=(Employee)context.getBean("emp1");
			Employee e2=(Employee)context.getBean("emp2");
			
			System.out.println(e1);
			System.out.println(e2);
		
				}

	}

