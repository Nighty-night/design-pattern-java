package sample01;

public class Client {
    public static void main(String args[]) {
        try {
            TV tv;
            String brandName = XMLUtilTV.getBrandName();
            tv = TVFactory.produceTV(brandName);
            tv.play();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
/**
 ���ó���
 ����������¿��Կ���ʹ�ü򵥹���ģʽ��
 (1) �����ฺ�𴴽��Ķ���Ƚ��٣����ڴ����Ķ�����٣�������ɹ��������е�ҵ���߼�̫�����ӡ�
 (2) �ͻ���ֻ֪�����빤����Ĳ�����������δ������󲢲����ġ�
**/
