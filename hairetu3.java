public class hairetu3{
  public static void main (String[]args){
    String shimei[]={"赤木太郎","青田花子","木村次郎","白井三郎","黒沢　学"};
    int tokuten[][]={
      {80,30,50},
      {70,50,70},
      {20,10,80},
      {90,80,90},
      {60,20,100},
    };
    System.out.println("学生5人の成績データを以下に表示します");
      for (int i=0;i<=4;++i){
        int sum=0;
        sum=sum+tokuten[i][0]+tokuten[i][1]+tokuten[i][2];
        String hyouka="A"';
        if (sum<250){hyouka="B";}
          else if(sum<150){hyouka="C";}
        }
        System.out.println(shimei[i]+" "+tokuten[i][0]+","+tokuten[i][1]+","+tokuten[i][2]+"    "+sum+"  "+hyouka);
      }
  }
}