package DemoPack.EatPack;

import java.util.Scanner;

public class GiveLike {

    Scanner input = new Scanner(System.in);

    public void click(Menu ds) {
        System.out.println("���\t��Ʒ\t\t\t����(Ԫ)\t������");
        for (int j = 0; j < ds.dishMeg.length; j++) {
            System.out.println((j + 1) + "\t" + ds.dishMeg[j] + "\t" + ds.price[j] + "\t" + ds.zan[j]);
        }
        System.out.print("��ѡ����Ҫ���޵Ĳ�Ʒ���:");
        int flag = input.nextInt();
        ds.zan[flag - 1]++;
        System.out.println("���޳ɹ���");
        System.out.println("���\t��Ʒ\t\t\t����(Ԫ)\t������");
        for (int j = 0; j < ds.dishMeg.length; j++) {
            System.out.println((j + 1) + "\t" + ds.dishMeg[j] + "\t" + ds.price[j] + "\t" + ds.zan[j]);
        }
    }
}
