package tw.ispan.model;

import java.util.Date;

public class Animal {

	private int id;

	private String name;

	private String continent;

	private Date date;

	public Animal() {
	}

	public Animal(int id, String name, String continent) {
		super();
		this.id = id;
		this.name = name;
		this.continent = continent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
