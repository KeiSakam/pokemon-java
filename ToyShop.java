//main()というメソッドが入っているクラスがすべてのプログラムの出発点
//コンストラクタを使うと、インスタンス設定と同時にフィールドに初期値を設定できるようになる。
//ShopKeeperは子構造のクラス名、suzukiは(インスタンスの)変数(名)(car1のがわかりやすい)。
//suzukiには、ShopKeeperという名前のクラスが入っている。
//さらにsuzukiという変数に、ShopKeeperクラスから生成したインスタンスを代入。
public class ToyShop{
       public static void main(String[] args){     //newは予約語。一応演算子。
              ShopKeeper suzuki =new ShopKeeper("鈴木");  //一番大元のクラスでインスタンスを作成。
              CarToy car1= new CarToy("C001",500);//←コンストラクタのおかげで
              PatrolCarToy patrolCar1= new PatrolCarToy("P001",600);//「フィールドの」初期値設定ができる。
              TrainToy train1= new TrainToy("T001",700);
              
              

//フィールドは具体的には基本形の「変数」やクラスの「変数」なので
//何か値を代入したり、中の値をほかの変数に代入や演算などに使える。
             
              //価格チェックの実行
//newで作ったインスタンスを「使って」メソッドやフィールドを「利用」する方法
//インスタンスが入っている変数suzukiを用いてメソッドcheckPriceを実行させる
//「インスタンスが入った変数名.メソッド名()」という公式。
//インスタンスの変数を引数として受け渡す
//checkPriceメソッドはShopKeeperクラスから呼び出す。
//ただクラスの代わりにクラスから生成したインスタンスが入っている変数suzukiを呼び出す。
              suzuki.checkPrice(car1,patrolCar1,train1);

             //デモの実行
             suzuki.doDemo(car1,patrolCar1,train1);

       }
}