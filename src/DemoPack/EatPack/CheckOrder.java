package DemoPack.EatPack;

public class CheckOrder {
    public void check(Information[] client) {
        System.out.println("***�鿴�ʹ�***");
        System.out.println("���\t������\t��Ʒ��Ϣ\t�Ͳ�����\t��ַ\t\t�ܽ��\t״̬");
        for (int i = 0; i < client.length; i++) {
            if (client[i].name != null) {
                String time = client[i].times + "ʱ";
                String pri = client[i].sumPrices + "Ԫ";
                String status = client[i].status == 0 ? "�����" : "��Ԥ��";
                System.out.println((i + 1) + "\t" + client[i].name + "\t" + "\t" + client[i].dishMegs + "\t" + time + "\t" + client[i].addresses + "\t" + pri + "\t" + status);
            }
        }
        System.out.println("************");
    }
}
