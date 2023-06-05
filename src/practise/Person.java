package practise;

public class Person {

	private String name;
	private Address address;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public static void main(String[] args) {
		Address address=new Address("pune");
		Person p=new Person("Raj", address);
		
		System.out.println(p.getAddress());
		System.out.println(p.getName());
		
		System.out.println(p);
		
		p.address.setVillageName("mumbai");
		System.out.println(p.getName());
		System.out.println(p);
		
		
		
	}
}
