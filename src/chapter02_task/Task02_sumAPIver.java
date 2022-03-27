package chapter02_task;
import java.util.stream.IntStream;

public class Task02_sumAPIver {
	public static void main(String[] args) {
		int i = IntStream.rangeClosed(1, 10).sum();
		System.out.println(i);
	}
}
