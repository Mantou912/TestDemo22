package DemoPack.EatPack;

import java.util.Scanner;

public class SignOff {
    public void confirm(Information[] client) {
        Scanner input = new Scanner(System.in);
        System.out.println("***ǩ�ն���***");
        System.out.print("��������Ҫǩ�յĶ�����ţ�");
        int flag = input.nextInt();
        boolean idFind = false;
        if (client[flag - 1].name != null && client[flag - 1].status == 1) {
            idFind = true;
            client[flag - 1].status = 0;
            System.out.println("***ǩ�����***");
        } else if (client[flag - 1].name != null && client[flag - 1].status == 0) {
            idFind = true;
            System.out.println("!!�Ѿ�ǩ�ղ����ظ�ǩ��!!");
        }
        if (!idFind) {
            System.out.println("!!������˼ û�ҵ�����Ҫǩ�յĶ���!!");
        }
        System.out.println("************");
    }
}
