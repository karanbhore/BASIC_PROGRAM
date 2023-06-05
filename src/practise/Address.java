package practise;

public class Address {

	String villageName;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String villageName) {
		super();
		this.villageName = villageName;
	}

	@Override
	public String toString() {
		return "Address [villageName=" + villageName + "]";
	}

	public String getVillageName() {
		return villageName;
	}

	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}
	
}
