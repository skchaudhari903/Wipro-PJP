import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;

public class EmployeeTest {
	Employee e = new Employee();
	ArrayList<String> list = new ArrayList<>();
	{
		list.add("Ajay");
		list.add("Vijay");
		list.add("Suresh");
	}
	
	@Test
	public void testFindName() {
		System.out.println(list);
		assertEquals("FOUND", e.findName(list, "Ajay"));
		System.out.println("tested");
	}

}
