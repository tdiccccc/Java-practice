//パッケージ宣言
package classMethod.human;

public class ClassMethod02 {
	public static void main(String[] args) {
		Human02 ohyama =new Human02(); //Human02クラスのインスタンスを生成
		System.out.println("名前は" + ohyama.name + "で、年齢は" + ohyama.age + "です。");
		
		Human02 sato = new Human02("佐藤", 25); //Human02クラスのインスタンスを生成
        System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");
	}
}
