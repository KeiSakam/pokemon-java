public class Kei{
       public static void main(String[] args){
              Satoshi satoshi =new Satoshi("サトシ");
              Pikachu pikachu1= new Pikachu("でんき",20);
              Oyapikachu pikachu2= new Oyapikachu("でんき",50);
              Kamex kamex= new Kamex("みず",70);
             
              //ポケモン召喚
              satoshi.shokan(pikachu1,pikachu2,kamex);

             //技の繰り出し
             satoshi.meirei(pikachu1,pikachu2,kamex);

       }
}
