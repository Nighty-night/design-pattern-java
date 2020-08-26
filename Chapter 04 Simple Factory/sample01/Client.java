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
 适用场景
 在以下情况下可以考虑使用简单工厂模式：
 (1) 工厂类负责创建的对象比较少，由于创建的对象较少，不会造成工厂方法中的业务逻辑太过复杂。
 (2) 客户端只知道传入工厂类的参数，对于如何创建对象并不关心。
**/
