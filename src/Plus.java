import java.util.ArrayList;
import java.util.LinkedList;

public class Plus extends Test {
	public Plus(int n) {
		super(n);
		// TODO Auto-generated constructor stub
	}





	public static void PlusArray() {
		
		for (int i = 0; i < num; i++) {

			listArray.add(i);

		}

	}

	public static void PlusLink() {
		for (int i = 0; i <num; i++) {
			listLink.add(i);

		}

	}

	public static void ChangeArray() {
		for (int i = 0; i <num; i++)
			listArray.set(0, i);
	}

	public static void ChangeLink() {
		for (int i = 0; i < num; i++)
			listLink.set(0, i);
		
		
	}

	public static void DeleteArray() {
		for (int i = 0; i < num; i++)
			listArray.remove(0);
		
	}

	public static void DeleteLink() {
		for (int i = 0; i < num; i++)
			listLink.remove(0);
		
	}

}
