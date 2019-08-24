public class Satoshi{
       String name_;

       //コンストラクタ
       public Satoshi(String name){
               name_=name;
       }

       //ポケモンを招喚する
       public void shokan(Pikachu kopika,Oyapikachu oyapika,Kamex kame){
              System.out.println("おれはマサラタウンの"+name_+"！ポケモン勝負だ！");
              System.out.println("いけ！ピカチュウ！(子)");
              kopika.nakigoe();
              System.out.println("("+kopika.type_+"タイプ,レベル"+kopika.level_+")");
              System.out.println("いけ！ピカチュウ！(親)");
              oyapika.nakigoe();
              System.out.println("("+oyapika.type_+"タイプ,レベル"+oyapika.level_+")");
              System.out.println("いけ！カメックス！");
              kame.nakigoe();
              System.out.println("("+kame.type_+"タイプ,レベル"+kame.level_+")");
              System.out.println();
       }

       //命令して技をくりだす
       public void meirei(Pikachu kopika,Oyapikachu oyapika,Kamex kame){
              System.out.println("ピカチュウ(子)、電光石火だ！");
              kopika.denkosekka();
              System.out.println("ピカチュウ(親)、カミナリだ！");
              oyapika.kaminari();
              System.out.println("カメックス、ハイドロポンプ！");
              kame.hydropomp();
       }
}
