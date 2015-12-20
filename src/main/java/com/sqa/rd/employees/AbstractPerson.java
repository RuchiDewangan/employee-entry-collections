/**
 * File Name: AbstractPerson.java<br>
 * Dewangan, Ruchi<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Dec 19, 2015
 */
package com.sqa.rd.employees;

/**
 * AbstractPerson //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Dewangan, Ruchi
 * @version 1.0.0
 * @since 1.0
 */
public abstract class AbstractPerson implements IPerson {

	private String address;

	private int age;

	private String name;

	public String getAddress() {
		return this.address;
	}

	public int getAge() {
		return this.age;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public boolean move() {
		// TODO Auto-generated method stub
		return false;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	// append means to add
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Class:");
		builder.append(this.getClass().getSimpleName());
		builder.append("who lives at");
		builder.append(this.address);
		builder.append("and is only");
		builder.append(this.age);
		builder.append(" years old, Welcome ");
		builder.append(this.name);
		builder.append("!");
		return builder.toString();
	}
}
