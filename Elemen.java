import java.util.ArrayList;

public class Elemen {
	private String name;
	private int age;
	private String gender;
	
	static ArrayList<Elemen> list = new ArrayList<Elemen>();
	
	public Elemen(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public static boolean findElemenByName(String name) {
		boolean status = false;
		
		for (Elemen elemen : list) {
			if (elemen.getName().equalsIgnoreCase(name)) {
				status = true;
			}
		}
		
		return status;
	}
	
	public static int getIndexElemen(String name) {
		int index = 0;
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equalsIgnoreCase(name)) {
				index = i;
			}
		}
		
		return index;
	}	
}
