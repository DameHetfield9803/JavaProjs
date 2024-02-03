import java.util.ArrayList;

public class arraylist{
	public static void main(String[] args) {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		newList.add(5);
		System.out.println(newList.size());
		newList.remove(0);
		System.out.println(newList.size());
	}
}