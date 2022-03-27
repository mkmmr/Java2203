package chapter02_task;
import java.util.ArrayList;

public class Task05_ArrayList {
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("apple");
		fruits.add("grape");
		fruits.add("orange");
		
		System.out.println("for文を用いたリスト要素の取り出し");
		for (int i = 0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}
		
		System.out.println("拡張for文を用いたリスト要素の取り出し");
		for (String s : fruits) {
			System.out.println(s);
		}
	}
}
