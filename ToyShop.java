//main()�Ƃ������\�b�h�������Ă���N���X�����ׂẴv���O�����̏o���_
//�R���X�g���N�^���g���ƁA�C���X�^���X�ݒ�Ɠ����Ƀt�B�[���h�ɏ����l��ݒ�ł���悤�ɂȂ�B
//ShopKeeper�͎q�\���̃N���X���Asuzuki��(�C���X�^���X��)�ϐ�(��)(car1�̂��킩��₷��)�B
//suzuki�ɂ́AShopKeeper�Ƃ������O�̃N���X�������Ă���B
//�����suzuki�Ƃ����ϐ��ɁAShopKeeper�N���X���琶�������C���X�^���X�����B
public class ToyShop{
       public static void main(String[] args){     //new�͗\���B�ꉞ���Z�q�B
              ShopKeeper suzuki =new ShopKeeper("���");  //��ԑ匳�̃N���X�ŃC���X�^���X���쐬�B
              CarToy car1= new CarToy("C001",500);//���R���X�g���N�^�̂�������
              PatrolCarToy patrolCar1= new PatrolCarToy("P001",600);//�u�t�B�[���h�́v�����l�ݒ肪�ł���B
              TrainToy train1= new TrainToy("T001",700);
              
              

//�t�B�[���h�͋�̓I�ɂ͊�{�`�́u�ϐ��v��N���X�́u�ϐ��v�Ȃ̂�
//�����l����������A���̒l���ق��̕ϐ��ɑ���≉�Z�ȂǂɎg����B
             
              //���i�`�F�b�N�̎��s
//new�ō�����C���X�^���X���u�g���āv���\�b�h��t�B�[���h���u���p�v������@
//�C���X�^���X�������Ă���ϐ�suzuki��p���ă��\�b�hcheckPrice�����s������
//�u�C���X�^���X���������ϐ���.���\�b�h��()�v�Ƃ��������B
//�C���X�^���X�̕ϐ��������Ƃ��Ď󂯓n��
//checkPrice���\�b�h��ShopKeeper�N���X����Ăяo���B
//�����N���X�̑���ɃN���X���琶�������C���X�^���X�������Ă���ϐ�suzuki���Ăяo���B
              suzuki.checkPrice(car1,patrolCar1,train1);

             //�f���̎��s
             suzuki.doDemo(car1,patrolCar1,train1);

       }
}