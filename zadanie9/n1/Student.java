package zadanie9.n1;
public class Student {
	private static int lastId = 0;
	private int id;
	public Student() {
		lastId++;
		this.id = lastId;
	}

	public int getId() {
		return this.id;
	}

}