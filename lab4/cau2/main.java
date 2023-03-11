package cau2;

public class main {
    public static void main(String[] args) throws Exception {
        Square hv=new Square();
        hv.setSide(15);
        System.out.println("canh hinh vuong = "+ hv.getSide());
        Rectangle hcn =new Rectangle();
        hcn.setLength(18);
        hcn.setWidth(3);
        System.out.println("dien tich hinh chu nhat la "+hcn.getArea());
    }
}

