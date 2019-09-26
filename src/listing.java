
public class listing {
	static long start;
	static long end;
	static int time[][]=new int [3][3];
	public static void main(String[] args) {
		
		int n=600_000;
		Test q =new Test(n);
		q.Full(0);
		q.Change(1);
		q.Delete(2); // from Begin of list
	    q.print();
	

	}

}
