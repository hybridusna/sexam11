package webapp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.context.support.ResourceBundleMessageSource;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ResourceBundleTest {
	
	@Test
	public void test1(){
		ResourceBundleMessageSource ms = new ResourceBundleMessageSource();
		
		ms.setBasename("/classpath:/message");
	}
	@Test
	public void test2(){
		
	}

}
