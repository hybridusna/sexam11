package webapp.beans;

import java.util.Calendar;

import org.springframework.beans.factory.FactoryBean;

public class CalendarFactoryBean implements FactoryBean<Calendar> {

	@Override
	public Calendar getObject() throws Exception {
		
		
		return Calendar.getInstance();
	}

	@Override
	public Class<?> getObjectType() {
		
		return Calendar.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
