public class Pikachu{
       String type_;    //タイプ
       int level_;      //レベル

       public Pikachu(String type,int level){
               type_=type;
               level_=level;
       }

       //鳴き声
       public void nakigoe(){
              System.out.println("ピッピカ！");
       }
        //技をだす(電光石火))
       public void denkosekka(){
              System.out.println("シュシュシュッ！");
       }
       
}
