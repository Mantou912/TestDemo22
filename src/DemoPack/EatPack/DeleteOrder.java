package DemoPack.EatPack;

import java.util.Scanner;

public class DeleteOrder {

    Scanner input = new Scanner(System.in);

    public void delete(Information[] client) {
        System.out.println("***ɾ������***");
        System.out.print("������Ҫɾ���Ķ������:");
        int flag = input.nextInt();
        if (client[flag - 1].name != null && client[flag - 1].status == 1) {
            System.out.println("��ѡ��Ķ�����δǩ�գ�����ɾ����");
        } else if (client[flag - 1].name != null && client[flag - 1].status == 0) {
            for (int i = flag - 1; i < client.length - 1; i++) {
                if (client[i + 1].name != null) {
                        client[i].setName(client[i + 1].name);
                        client[i].setDishMegs(client[i + 1].dishMegs);
                        client[i].setAddresses(client[i + 1].addresses);
                        client[i].setStatus(client[i + 1].status);
                        client[i].setTimes(client[i + 1].times);
                        client[i].setSumPrices(client[i + 1].sumPrices);
                        client[i].setNum(client[i + 1].num);
                }
            }
            for (int i = client.length - 1; i >= 0; i--) {
                if (client[i].name != null) {
                    client[i].Delete();
                    break;
                }
            }
            System.out.println("***ɾ�����***");
        }
    }
}
