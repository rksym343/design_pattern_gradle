package design_pattern.ch03.check01;

import java.util.Calendar;

public class FakeTimeProvider implements TimeProvider {

	private Calendar cal;

	public FakeTimeProvider() {
		cal = Calendar.getInstance();
	}

	public FakeTimeProvider(int hour) {
		this();
		setHours(hour);
	}

	@Override
	public void setHours(int hour) {
		cal.set(Calendar.HOUR_OF_DAY, hour);
	}

	@Override
	public int getTime() {
		return cal.get(Calendar.HOUR_OF_DAY);
	}

}
