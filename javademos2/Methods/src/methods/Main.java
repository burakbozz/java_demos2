package methods;

public class Main {

	public static void main(String[] args) {
		
		findNumber();
		findNumber();
		findNumber();
		findNumber();

	}
	
	public static void findNumber() {
		
		int[] numbers = new int[] {1,2,5,7,9,0};
		int toFind = 5;
		boolean isExist =false;
		
		for (int number : numbers) {
			if(number == toFind) {
				isExist = true;
				break;
			}
			
		}
		
		if(isExist) {
			giveMessage("number is exist:" +toFind);

		}else {
			giveMessage("number is  not exist:" +toFind);
		}
		
		
	}
	
	public static void giveMessage(String message) {
		System.out.println(message);
		
		
	}

}
