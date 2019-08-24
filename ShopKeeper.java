public class ShopKeeper{
       String name_;        //ここで名前という変数（フィールド）を定義

       //コンストラクタ
//ここでToyShopで初期値を設定したので引数のString nameには"鈴木"が入っている。
       public ShopKeeper(String name){
               name_=name;   //今定義したフィールドに"鈴木"を代入
       }  //nameでなくてname_を使っていく。

       //価格をチェックする
//code_というフィールドの、kuruma1の中身を呼び出す。
       public void checkPrice(CarToy kuruma1,PatrolCarToy patoka,TrainToy densya1){
              System.out.println("店長の"+name_+"です。これから価格をチェックします");
              System.out.println("商品コード"+kuruma1.code_+"の価格は"+kuruma1.price_+"円です。");
              System.out.println("商品コード"+patoka.code_+"の価格は"+patoka.price_+"円です。");
              System.out.println("商品コード"+densya1.code_+"の価格は"+densya1.price_+"円です。");
              System.out.println();
       }

       //デモをする
       //今回は走らせるだけ。
       public void doDemo(CarToy kuruma1,CarToy kuruma2,TrainToy densya1){
              System.out.println("店長の"+name_+"です。これからデモをします");
              System.out.println("クルマ１を走らせます。");
              kuruma1.go();
              System.out.println("パトカーを走らせます。同時にサイレン");
              patoka.go();
              System.out.println("電車を走らせます。");
              densya1.go();
              System.out.println();
       }
}

