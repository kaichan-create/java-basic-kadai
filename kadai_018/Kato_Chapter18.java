package kadai_018;

public abstract class Kato_Chapter18 {
	//フィールド

	public String familyName="加藤"; //姓を表す
	public String givenName =""; //名を表す
	public String address="東京都中野区〇×"; //住所を表す
	
	//【メソッド】共通の紹介
	public void commonIntroduce() {
		System.out.println("名前は"+this.familyName+this.givenName+"です"); //共通の紹介出力
		System.out.println("住所は"+this.address+"です");
	}
	
	//【メソッド】個別の紹介
	public abstract void eachIntroduce();
	
	
	//【メソッド】紹介を実行する
	public void execIntroduce() {
		this.commonIntroduce();
		this.eachIntroduce();
		System.out.println();
	}
	
	
}
