/*Create a class Employee and implement the below method in the class.
public String findName(ArrayList employees,String name){
  String result="";
  if(employees.contains(name)){
   result="FOUND";
  }else{
   result="NOT FOUND";
  }
  return result;
 }
Write JUnit testcases to test the above method.
*/

import java.util.ArrayList;

public class Employee {
	public String findName(ArrayList employees,String name) {
		String result = "";
		  if(employees.contains(name)) {
			  result="FOUND";
		  }
		  else{
		   result="NOT FOUND";
		  }
		  return result;
	}

}
