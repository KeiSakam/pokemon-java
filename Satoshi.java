public class Satoshi{
       String name_;

       //�R���X�g���N�^
       public Satoshi(String name){
               name_=name;
       }

       //�|�P��������������
       public void shokan(Pikachu kopika,Oyapikachu oyapika,Kamex kame){
              System.out.println("����̓}�T���^�E����"+name_+"�I�|�P�����������I");
              System.out.println("�����I�s�J�`���E�I(�q)");
              kopika.nakigoe();
              System.out.println("("+kopika.type_+"�^�C�v,���x��"+kopika.level_+")");
              System.out.println("�����I�s�J�`���E�I(�e)");
              oyapika.nakigoe();
              System.out.println("("+oyapika.type_+"�^�C�v,���x��"+oyapika.level_+")");
              System.out.println("�����I�J���b�N�X�I");
              kame.nakigoe();
              System.out.println("("+kame.type_+"�^�C�v,���x��"+kame.level_+")");
              System.out.println();
       }

       //���߂��ċZ�����肾��
       public void meirei(Pikachu kopika,Oyapikachu oyapika,Kamex kame){
              System.out.println("�s�J�`���E(�q)�A�d���Ή΂��I");
              kopika.denkosekka();
              System.out.println("�s�J�`���E(�e)�A�J�~�i�����I");
              oyapika.kaminari();
              System.out.println("�J���b�N�X�A�n�C�h���|���v�I");
              kame.hydropomp();
       }
}
