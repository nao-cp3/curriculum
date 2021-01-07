package check;

import constants.Constants;

public class Check {

	private static String firstName;
	private static String lastName;

	public static void main(String[] args) {
		
		firstName = "上田";
		lastName = "直哉";
		
		System.out.println("printNameメソッド→" + printName(firstName, lastName));
		
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pet.introduce();
		
		
		
		RobotPet robotpet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		robotpet.introduce();
		
	}
	
	 private static String printName(String firstName, String lastName) {
		return firstName + lastName;
	 }

}