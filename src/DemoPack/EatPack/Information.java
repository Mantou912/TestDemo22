package DemoPack.EatPack;

public class Information {
    String name;                            //������
    String dishMegs;                        //��Ʒ��
    int num;                                //��Ʒ����
    int times;               //�Ͳ�ʱ��//10-20
    String addresses;     //�Ͳ͵�ַ
    int status;              //����״̬//0��������ɣ�1������Ԥ��
    double sumPrices;     //�ܽ��

    public Information() {
    }

    public void setName(String n) {
        name = n;
    }

    public void setDishMegs(String n) {
        dishMegs = n;
    }

    public void setNum(int n) {
        num = n;
    }

    public void setTimes(int n) {
        times = n;
    }

    public void setAddresses(String n) {
        addresses = n;
    }

    public void setStatus(int n) {
        status = n;
    }

    public void setSumPrices(double n) {
        sumPrices = n;
    }

    public void Delete() {
        name = null;
        dishMegs = null;
        addresses = null;
        num = 0;
        times = 0;
        status = 0;
        sumPrices = 0;
    }
}
