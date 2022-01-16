import java.util.*;
public class urldatabase {

	public static void main(String[] args) {
		String aa = "storeurl";
		String bb = "get";
		String cc = "count";
		String dd = "list";
		String ee = "exit";
		HashMap<String, String> keymap = new HashMap<>();
		HashMap<String, Integer> countmap = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i--){
			System.out.println("enter the command: ");
		    String command = sc.nextLine();
		if(command.equals(aa)) {
			String url = new String();
			String key = new String();
			int c = 0;
			System.out.println("enter the url:");
			url = sc.nextLine();
			key = url.substring((url.length()/2)-2 , (url.length()/2)+3);
			keymap.put(url, key);
			countmap.put(url,c);
			continue;
		}
		if(command.equals(bb)) {
			String b = new String();
			int x = 0;
			System.out.println("enter the url:");
			b = sc.nextLine();
			System.out.println(keymap.get(b));
			x = countmap.get(b)+1;
			countmap.replace(b, x);
			continue;
		}
		if(command.equals(cc)) {
			String s = new String();
			System.out.println("enter the url:");
			s = sc.nextLine();
			System.out.println(countmap.get(s));
			continue;
		}
		if(command.equals(dd)) {
			System.out.println(countmap.toString());
			continue;
		}
		
		if(command.equals(ee)) {
			System.exit(0);
		}
		}
	}
}
	


