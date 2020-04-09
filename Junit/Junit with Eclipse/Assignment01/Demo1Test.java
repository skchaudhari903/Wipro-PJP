import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Demo1Test {

	@Test
	void testStringConcat() {
		Demo1 demo1 = new Demo1();
		assertEquals("tomcat", demo1.stringConcat("tom", "cat"));
	}

}
