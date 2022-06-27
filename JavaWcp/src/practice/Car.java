package practice;

public class Car {
    // 燃費（Km/L）
    private double fuelCost;
    // 残量（L）
    private double fuelAmount;

    // コンストラクタを作成
    //コンストラクタは、「燃費」「残量」の引数を「double」型で定義します。引数をフィールドに代入します。
    public Car(double fuelCost, double fuelAmount) {
        this.fuelCost = fuelCost;
        this.fuelAmount = fuelAmount;
    }
    
    
    // moveメソッド
    //int」型を引数にして定義します。「km + " km 走ります"」
    //を出力します。残量から走った分の燃料を計算して、引き算します。
    public void move(int km) {
        System.out.println(km + " km 走ります");
        this.fuelAmount -= (km / fuelCost);
    }
    
    
    // ・"xx km 走ります"を出力
    // ・残量を計算

    // fuelAmountを取得するメソッドを作成
    //フィールドの「fuelAmount」をreturnします。
    public double getFuelAmount() {
        return this.fuelAmount;
    }
}