package Example00;

public class Test01 {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
			      
		System.out.println("눈 : "+animal.eye_count);
		System.out.println("발 : "+animal.feet_count);
		animal.run();
		animal.sound();
			      
		Human man = new Human();
			      
		System.out.println("인간 눈 : "+man.eye_count);
		System.out.println("인간 발 : "+man.feet_count);
		man.run();
		man.sound();
		man.study();
	}

}
