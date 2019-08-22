
public class SwitchTest {
	public static void main(String[] args) {
		int i = 10;

		if (i == 20) {
		} else if (i == 30) {
		} else if (i == 50) {
		} // else if (i > 300) {}

		switch (i) {
		case 10:
			i++;
			System.out.println(i);
			break;
		case 20:
			break;
		case 30:
			break;
		}

		String str = "hello";
		switch (str) {
		case "h": {
			System.out.println(i);
			break;
		}
		case "e": {
			break;
		}
		default:
			break;
		}
	}
}
