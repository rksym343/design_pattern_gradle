package design_pattern.ch01.check02;

public class Person {
	private Phone homePhones;
	private Phone officePhones;

	public Phone getHomePhones() {
		return homePhones;
	}

	public void setHomePhones(Phone homePhones) {
		this.homePhones = homePhones;
	}

	public Phone getOfficePhones() {
		return officePhones;
	}

	public void setOfficePhones(Phone officePhones) {
		this.officePhones = officePhones;
	}

	@Override
	public String toString() {
		return "Person [homePhones=" + homePhones + ", officePhones=" + officePhones + "]";
	}
	
	

}
