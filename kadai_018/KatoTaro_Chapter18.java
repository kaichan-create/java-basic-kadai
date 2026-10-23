package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {
	
	public void setGivenName() {
		this.givenName ="太郎";		
	}
	
	//	抽象メソッドに具体的な処理を記述する
	public void eachIntroduce() {
		System.out.println("Javaが得意です");
	}
}
