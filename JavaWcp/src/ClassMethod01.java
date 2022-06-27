
public class ClassMethod01 {
	public static void main(String[] args) {
		Human01 tamaki = new Human01();//Human01クラスのインスタンスを生成
		System.out.println("名前は" + tamaki.name + "で、年齢は" + tamaki.age + "です。");
		
		Human01 muto = new Human01("武藤", 25);//Human01クラスのインスタンスを生成
		System.out.println("名前は" + muto.name + "で、年齢は" + muto.age + "です。");
	}
}
