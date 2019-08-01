
public class LogicalOper {
	Student s1;
	
	static boolean update(Student s, String name) {
	   /* if (s == null) {
		   return false;
		}*/
		
		if(s != null && s.id > 1000) {
			s.name = name;		
		}
		return true;
	}

	static void logicalOperators() {
		System.out.println("\nInside logicalOperators ...");
		int age = 37;
	    int salary = 85000;
	    boolean hasBadCredit = false;
		
		// 1. Core (AND, OR, NOT & Operator Chaining)
	    
	    if (age > 35 && salary > 90000 || !hasBadCredit) {
	    	System.out.println("Loan approved!");
	    } else {
			System.out.println("Loan not approved!");
		}
		
		// 2. 
		//    (a) Left-associative ~ Order of grouping
		//    (b) Associativity (a && b) && c = a && (b && c)
		//    Applies to both && and ||
		
		
		// 3. 
		//    (a) Operator precedence of Logical Operators: Helps with ONLY grouping operations. Not order of execution. (! > && > ||)
		
		          // Other Examples: A && B || C && D = (A && B) || (C && D)
				  //                 A && B && C || D = ((A && B) && C) || D
		
		
		//    (b) Operator Precedence across logical, comparison and arithmetic
		//          ! > arithmetic > comparison > &&, ||
		//    See resources section for complete precedence rules
		
		// ALWAYS USE PARENTHESIS for READABILITY. Not everyone is aware of precedence rules
		
		// 4. Use && to avoid NullPointerException
		Student s1 = new Student(1001, "Raj");
		update(s1, "Dheeru");
		System.out.println(s1.name);
	}
	
		
	
	public static void main(String[] args) {	
	  
      logicalOperators();	  
	  
    }  

    	
  }

