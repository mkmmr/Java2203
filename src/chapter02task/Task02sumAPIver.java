package chapter02_task;
import java.util.stream.IntStream;

public class Task02_sumAPIver {
	public static void main(String[] args) {
		System.out.println(IntStream.rangeClosed(1, 10).sum());
	}
}
