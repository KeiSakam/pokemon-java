public class hairetu3{
  public static void main (String[]args){
    String shimei[]={"�Ԗؑ��Y","�c�Ԏq","�ؑ����Y","����O�Y","����@�w"};
    int tokuten[][]={
      {80,30,50},
      {70,50,70},
      {20,10,80},
      {90,80,90},
      {60,20,100},
    };
    System.out.println("�w��5�l�̐��уf�[�^���ȉ��ɕ\�����܂�");
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