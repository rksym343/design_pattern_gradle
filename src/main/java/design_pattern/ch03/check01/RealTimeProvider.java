package design_pattern.ch03.check01;

import java.util.Calendar;

public class RealTimeProvider implements TimeProvider {

	private Calendar cal;

	public RealTimeProvider() {
		cal = Calendar.getInstance();
	}

	@Override
	public void setHours(int hour) {

	}

	@Override
	public int getTime() {
		return cal.get(Calendar.HOUR_OF_DAY);
	}

}
