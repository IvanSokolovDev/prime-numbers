import java.util.ArrayList;
import java.util.List;

public class Number {
	private static final int from = 2;
	private static final int to = 101;

	public static void main(String[] args) {
		System.out.println(primeNumbers());
	}

	public static List<Integer> primeNumbers() {
		List<Integer> list = new ArrayList<>();

		for (int i = from; i < to; i++) {
			boolean isPrimary = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrimary = false;
					break;
				}
			}

			if (isPrimary) {
				list.add(i);
			}
		}

		return list;
	}
}
