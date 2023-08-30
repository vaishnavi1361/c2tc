package daySixcom.cg.statickeyword;

public class Sudent {
	private int id;
	private String name;
	private static String dept="ise";
	private static  String batchno="b70";
	private static String clgname="dsatm";
	
	public Sudent(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Sudent [id=" + id + ", name=" + name + "]";
	}
	
	void display() {
		System.out.println(id+" "+name+" "+dept+" ");
	}

}
