
import com.supermap.control.AddOperation;
import com.supermap.control.Operation;
import com.supermap.data.CusButton;

/**
 * @author Administrator
 */
public class StackTest {

	public static void main(String[] args) {

		CusButton button = new CusButton("ddsad");
		button.setOperation(new AddOperation());

		Operation operation1 = button.getOperation();

		System.out.println(operation1.text);
		System.out.println(operation1.getLevel());




	}
}
