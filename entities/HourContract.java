package entities;

import java.util.Date;

public class HourContract {

	private Date date;
	private Float valuePerHour;
	private Integer hours;
	
	public HourContract() {}

	public HourContract(Date date, Float valuePerHour, Integer hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Float getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Float valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public float totalValue() {
		return valuePerHour * hours;
	}
}
