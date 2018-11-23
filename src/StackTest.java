import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Administrator
 */
public class StackTest {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.add(6);
		while (!queue.isEmpty()){
			System.out.println(queue.poll());
		}
	}
}
