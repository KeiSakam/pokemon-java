//フィールドも変数の一種？↓
public class CarToy{
       String code_;    //商品コードのフィールドを定義
       int price_;      //価格

//インスタンスに初期値を設定するような処理にはコンストラクタが便利
//コンストラクタはインスタンス生成時に一度だけ実行される特殊メソッド
//引数は持てるが戻り値は持てない。
       public CarToy(String code,int price){
               code_=code;
               price_=price;
       }

       //走る
       public void go(){
              System.out.println("ブロローッ");
       }
       //ライトを付ける
       public void light(){
              System.out.println("ピカーッ");
       }
       
}
