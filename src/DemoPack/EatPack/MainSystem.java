package DemoPack.EatPack;

import java.util.Scanner;

public class MainSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("��ӭʹ�á��Ի����˶���ϵͳ��");
        StartPage hh = new StartPage();         //��ʼ�˵�ҳ��
        ExitSystem ex = new ExitSystem();       //0���˳�ϵͳ
        PlaceOrder dc = new PlaceOrder();       //1����Ҫ����
        CheckOrder ck = new CheckOrder();       //2���鿴�ʹ�
        SignOff qs = new SignOff();             //3��ǩ�ն���
        DeleteOrder del = new DeleteOrder();    //4��ɾ������
        GiveLike cli = new GiveLike();          //5����Ҫ����

        Information[] cl = new Information[4];

        for (int i = 0; i < cl.length; i++) {
            cl[i] = new Information();
        }

        cl[0].setName("123");
        cl[0].setDishMegs("������˿");
        cl[0].setNum(1);
        cl[0].setTimes(10);
        cl[0].setAddresses("China");
        cl[0].setStatus(1);                     //0��������ɣ�1������Ԥ��
        cl[0].setSumPrices(120.0);
        Menu ds = new Menu();

        int chs;
        do {
            hh.Welcome();
            System.out.print("��ѡ��");
            chs = input.nextInt();
            switch (chs) {
                case 0 -> ex.exit();
                case 1 -> dc.choose(cl, ds);
                case 2 -> ck.check(cl);
                case 3 -> qs.confirm(cl);
                case 4 -> del.delete(cl);
                case 5 -> cli.click(ds);
            }
        } while (chs != 0);
    }
}
