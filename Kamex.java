public class Kamex{
       String type_;    //タイプ
       int level_;      //レベル

       //コンストラクタ
       public Kamex(String type,int level){
               type_=type;
               level_=level;
       }

       //鳴き声
       public void nakigoe(){
              System.out.println("カ～～メックス！");
       }
       //技をだす(ハイドロポンプ)
       public void hydropomp(){
              System.out.println("ドドドドド");
       }
       
}
