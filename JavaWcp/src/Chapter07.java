
public class Chapter07 {
	public static void main(String[] args) {
		int val = 16;
		if (val <= 5) {
			System.out.println("very near");
		} else if (val <= 10){
			System.out.println("near");
		} else if (val <= 15) {
			System.out.println("far");
		} else {
			System.out.println("very far");
		}
		
		String color = "";
		switch(color){
		case "red":
			System.out.println("this is red");
			break;
		case "yellow":
			System.out.println("this is yellow");
			break;
		case "bulue":
			System.out.println("this is red");
			break;
		default:
			System.out.println("this is none");
		}
	}
}
