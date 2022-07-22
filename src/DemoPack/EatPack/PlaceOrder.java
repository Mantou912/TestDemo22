package DemoPack.EatPack;

import java.util.Scanner;

public class PlaceOrder {
    Scanner input = new Scanner(System.in);

    public void choose(Information[] client, Menu ds) {

        for (int i = 0; i < client.length; i++) {
            if (client[i].name == null) {
                System.out.println("***��Ҫ����***");
                System.out.print("�����붩����������");
                client[i].setName(input.next());

                System.out.println("���\t��Ʒ\t\t\t����(Ԫ)\t������");
                for (int j = 0; j < ds.dishMeg.length; j++) {
                    System.out.println((j + 1) + "\t" + ds.dishMeg[j] + "\t" + ds.price[j] + "\t" + ds.zan[j]);
                }

                System.out.print("ѡ���Ʒ��ţ�");
                int num = input.nextInt();
                while (num >= ds.dishMeg.length) {
                    System.out.println("��ѡ��˵������еĲ�Ʒ���");
                    num = input.nextInt();
                }

                String dish = ds.dishMeg[num - 1];
                System.out.print("������");
                int fen = input.nextInt();
                double pri = ds.price[num - 1] * fen;
                double p = pri > 50 ? 0 : 5;

                System.out.print("�Ͳ�ʱ�䣨10~20�㣩:");
                int time = input.nextInt();
                while (time < 10 || time > 20) {
                    System.out.print("sorry,�����Ͳ�ʱ���ڣ��������룺");
                    time = input.nextInt();
                }
                System.out.print("��ַ��");
                String address = input.next();
                System.out.println("***���ͳɹ�***");
                System.out.println("�������ǣ�" + dish + fen + "��" + "\t" + "�Ͳ�ʱ���ǣ�" + time + "��\t" + "�ͷ��ǣ�" + pri + "Ԫ  �Ͳͷ��ǣ�" + p + "Ԫ  �ܼƣ�" + (pri + p) + "Ԫ");

                client[i].setDishMegs(dish);
                client[i].setTimes(time);
                client[i].setStatus(1);
                client[i].setAddresses(address);
                client[i].setSumPrices(pri + p);
                break;
            } else if (i == client.length - 1) {
                System.out.println("������˼���ʹ�����");
            }
        }
        System.out.println("************");
    }
}
