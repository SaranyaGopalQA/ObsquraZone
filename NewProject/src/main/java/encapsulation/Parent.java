package encapsulation;

public class Parent {
private String name;
private int age;
private String address;
private int pin;

public void setName(String name)
{
	this.name=name;

}
public String getName()
{
	return name;
}

public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
public void setAge(int age)
{
	this.age=age;

}
public int getAge()
{
	return age;
}
}
