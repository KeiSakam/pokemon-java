public class ShopKeeper{
       String name_;        //�����Ŗ��O�Ƃ����ϐ��i�t�B�[���h�j���`

       //�R���X�g���N�^
//������ToyShop�ŏ����l��ݒ肵���̂ň�����String name�ɂ�"���"�������Ă���B
       public ShopKeeper(String name){
               name_=name;   //����`�����t�B�[���h��"���"����
       }  //name�łȂ���name_���g���Ă����B

       //���i���`�F�b�N����
//code_�Ƃ����t�B�[���h�́Akuruma1�̒��g���Ăяo���B
       public void checkPrice(CarToy kuruma1,PatrolCarToy patoka,TrainToy densya1){
              System.out.println("�X����"+name_+"�ł��B���ꂩ�牿�i���`�F�b�N���܂�");
              System.out.println("���i�R�[�h"+kuruma1.code_+"�̉��i��"+kuruma1.price_+"�~�ł��B");
              System.out.println("���i�R�[�h"+patoka.code_+"�̉��i��"+patoka.price_+"�~�ł��B");
              System.out.println("���i�R�[�h"+densya1.code_+"�̉��i��"+densya1.price_+"�~�ł��B");
              System.out.println();
       }

       //�f��������
       //����͑��点�邾���B
       public void doDemo(CarToy kuruma1,CarToy kuruma2,TrainToy densya1){
              System.out.println("�X����"+name_+"�ł��B���ꂩ��f�������܂�");
              System.out.println("�N���}�P�𑖂点�܂��B");
              kuruma1.go();
              System.out.println("�p�g�J�[�𑖂点�܂��B�����ɃT�C����");
              patoka.go();
              System.out.println("�d�Ԃ𑖂点�܂��B");
              densya1.go();
              System.out.println();
       }
}

