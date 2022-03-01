package ExampleSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

		

		public class ClientAddress {
				public static void main(String args[]) {
//					
//					EmployeeAddress ea=new EmployeeAddress(); //general java code
//					ea.setEid(110);
//					ea.setEname("Nikii");
//					ea.setAddress("Redwood Shores");
//					
//					System.out.println(ea);
					
					//using IOC
			ApplicationContext context=new ClassPathXmlApplicationContext("EmployeeAddressBean.xml");
			EmployeeAddress ea1=(EmployeeAddress)context.getBean("emp1");
			
			System.out.println(ea1);
		
				}

	}

