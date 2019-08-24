//パトロールがサブ、カーがスーパーとしてパトロールを新たに作って継承
public class PatrolCarToy extends CarToy{
       //コンストラクタ
       public PatrolCarToy(String code,int price){ 
           super(code,price);  //スーパーの要素を使う
       }

       //サイレンを鳴らす
       public void go(){
              System.out.println("ウ～ウ～,ブロローッ");
       }
}
