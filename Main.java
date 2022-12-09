public class Main {
	 public static void main(String[] args) {
		
		 // Fighter 객체를 하나 만들고, 
		 Fighter fighter1 = new Warrior();
		 fighter1.attack();
		 fighter1.defend();
		 fighter1.escape();

		 // Fighter 객체는 Wizard 를 쓰고 싶다.
		 WizardAdapter fighter2 = new WizardAdapter(); // 오류!
		 fighter2.attack(); // attack method 가 달라서 쓸 수 없음.
		 fighter2.defend(); 
		 fighter2.escape();
	} 
}