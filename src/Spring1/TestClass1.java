package Spring1;

public class TestClass1 {
	int id;
	String name;
	String city;

	public static void main(String[] args) {
		A a = new A();
		TestClass1 t =a;
		System.out.println(t);
		System.out.println(a);
		t.id = 6;
	}
}

class A extends TestClass1 {

}