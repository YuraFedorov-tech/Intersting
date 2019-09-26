import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.xml.soap.Node;

public class Test extends listing {
	private Node first;
	private Node last;
	protected static LinkedList<Integer> listLink = new LinkedList<Integer>();
	protected static ArrayList<Integer> listArray = new ArrayList<Integer>();
	long f;
	long e;
	static int num;
	static int z = 1;
	static int size;

	public Test(int n) {
		first = null;
		last = null;
		num = n;
		size = 0;
	}

	public void Full(int i) {
		f = System.currentTimeMillis();
		Plus.PlusArray();
		e = System.currentTimeMillis();
		time[i][0] = (int) ((e - f) / z);

		f = System.currentTimeMillis();
		Plus.PlusLink();
		e = System.currentTimeMillis();
		time[i][1] = (int) ((e - f) / z);

		f = System.currentTimeMillis();
		PlusMode();
		e = System.currentTimeMillis();
		time[i][2] = (int) ((e - f) / z);

	}

	private void PlusMode() {
		for (int i = 0; i < num; i++)
			AddFirst(i);
	}

	private int RemovLast() {
		int inem = last.item;
		last = last.next;
		return inem;

	}

	private void AddFirst(int inem) {
		Node old = first;
		first = new Node();
		first.item = inem;
		if (inem != 0)
			old.next = first;
		else
			last = first;
		size++;
	}

	private class Node {
		int item;
		Node next;

	}

	public void print() {
		System.out.printf(
				"                                        Array" + "\t" + "Linked" + "\t" + "Наш список" + "\t" + "\n");
		String s[] = { "Добавляем в нулевую позицию        ", "Заменяем элемент в первой позиции",
				"Удаляем нулевую позицию            " };
		for (int i = 0; i < 3; i++) {
			System.out.printf(s[i] + "\t");
			for (int j = 0; j < 3; j++) {
				System.out.printf(time[i][j] + "\t");
			}
			System.out.println();
		}

	}

	public void Change(int i) {
		f = System.currentTimeMillis();
		Plus.ChangeArray();
		e = System.currentTimeMillis();
		time[i][0] = (int) ((e - f) / z);

		f = System.currentTimeMillis();
		Plus.ChangeLink();
		e = System.currentTimeMillis();
		time[i][1] = (int) ((e - f) / z);

		f = System.currentTimeMillis();
		ChangeMode();
		e = System.currentTimeMillis();
		time[i][2] = (int) ((e - f) / z);

	}

	private void ChangeMode() {
		for (int i = 0; i < num; i++)
			last.item = i;

	}

	public void Delete(int i) {
		f = System.currentTimeMillis();
		Plus.DeleteArray();
		e = System.currentTimeMillis();
		time[i][0] = (int) ((e - f) / z);

		f = System.currentTimeMillis();
		Plus.DeleteLink();
		e = System.currentTimeMillis();
		time[i][1] = (int) ((e - f) / z);

		f = System.currentTimeMillis();
		DeleteMode();
		e = System.currentTimeMillis();
		time[i][2] = (int) ((e - f) / z);

	}

	private void DeleteMode() {
		for (int i = 0; i < num; i++) {
			if (size != 0)
				last = last.next;
			
			size--;
		}

	}

}
