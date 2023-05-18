package bai1;
import java.time.LocalDate;
public class main {

    public static void main(String[] args) {
        Product a = new Product("nuoc tuong", "sp4", 8000);
        Product b = new Product("gao", "sp1", 18000);
        Product c = new Product("duong", "sp3", 10000);
        Product d = new Product("gao", "sp1", 18000);
        Product e = new Product("muoi", "sp5", 5000);
        Product g = new Product("nuoc mam", "sp6", 25000);
        Product h = new Product("bot ngot", "sp8", 19000);
        OrderDetail x1 = new OrderDetail(a, 1);
        OrderDetail x2 = new OrderDetail(b, 2);
        OrderDetail x3 = new OrderDetail(c, 3);
        OrderDetail x4 = new OrderDetail(d, 4);
        OrderDetail x5 = new OrderDetail(e, 5);
        OrderDetail x6 = new OrderDetail(h, 6);
        OrderDetail x7 = new OrderDetail(g, 7);
        Order o = new Order();
        o.addLineItem(a, 10);
        o.addLineItem(b, 5);
        o.addLineItem(c, 1);
        o.addLineItem(d, 1);
        o.addLineItem(e, 2);
        o.addLineItem(g, 2);
        o.addLineItem(h, 2);
        System.out.println("Ma HD" + o.getOrderID());
        System.out.println("Ngay lap hoa don:"+LocalDate.now());
        o.Xuat();
        System.out.println("tong tien thanh toan:" + o.calcTotalCharge() + "VND");
    }
}
