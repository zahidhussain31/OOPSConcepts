package com.amzar.code;

public class PojoAmzar {
	
	public String name;
	
	public int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "PojoAmzar [name=" + name + ", id=" + id + "]";
	}
	
	

}
