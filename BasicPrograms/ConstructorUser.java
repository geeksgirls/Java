
public class ConstructorUser {
	
	     int id;
	     String name;
	     int salary;

	     ConstructorUser(int userId, String userName) { 
		     id = userId;
	         name = userName;
	         //this(userId,userName,0);
	     }
		 String TestName;
		 ConstructorUser(int userId, String userName, int userSalary) { 
			 this(userId, userName);
			 
			 salary = userSalary;
			 
	     }   
		 
		 public static void main(String[] args) {
			ConstructorUser instructor = new ConstructorUser(1002, "Dheeru", 50000);
			System.out.println("Name: " + instructor.name);
		 }
	}

