//�t�B�[���h���ϐ��̈��H��
public class CarToy{
       String code_;    //���i�R�[�h�̃t�B�[���h���`
       int price_;      //���i

//�C���X�^���X�ɏ����l��ݒ肷��悤�ȏ����ɂ̓R���X�g���N�^���֗�
//�R���X�g���N�^�̓C���X�^���X�������Ɉ�x�������s�������ꃁ�\�b�h
//�����͎��Ă邪�߂�l�͎��ĂȂ��B
       public CarToy(String code,int price){
               code_=code;
               price_=price;
       }

       //����
       public void go(){
              System.out.println("�u�����[�b");
       }
       //���C�g��t����
       public void light(){
              System.out.println("�s�J�[�b");
       }
       
}
