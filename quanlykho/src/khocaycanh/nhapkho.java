package khocaycanh;
 import java.util.Scanner;
 import java.util.ArrayList;
public class nhapkho extends caycanh 
{
    private float giathanh;
    private long  ngaynhap;  
    private ArrayList<nhacungcap> NCC;
    nhacungcap nhacungcap ;

    public nhapkho(int MaCC, String tencay, String phanloai, int soluong,float giathanh,long ngaynhap) {
        super(MaCC, tencay, phanloai, soluong);
        this.giathanh=giathanh;
        this.ngaynhap=ngaynhap;
    }
    public float getgiathanh(){
        return giathanh;
        }
    public void setgiathanh(float giathanh){
        this.giathanh=giathanh;
        }
    public long  getngaynhap(){
        return ngaynhap;
        }
    public void setngaynhap(long ngaynhap1){
        this.ngaynhap=ngaynhap;
        }
    public ArrayList<nhacungcap> getNCC() {
return NCC;
}
public void setNCC(ArrayList<nhacungcap> NCC) {
this.NCC = NCC;
}
public nhacungcap getnhacungcap() {
return nhacungcap;
}
public void setnhacungcap(nhacungcap nhacungcap) {
this.nhacungcap = nhacungcap;
}
@Override
    public void nhap()
    {
        Scanner input= new Scanner(System.in);
        super.nhap();
        System.out.print("gia nhap vao cua cay : ");
        giathanh= input.nextFloat();
        System.out.print("ngay nhap cay vao : ");
        ngaynhap= input.nextLong();
        setngaynhap(ngaynhap);
        nhapdsnhacungcap();
    }
    public void nhapdsnhacungcap(){
        Scanner input= new Scanner(System.in);
            System.out.print("Nhap so luong hang can nhap : ");
            int n = input.nextInt();
            NCC = new ArrayList<>();
            for(int i=0; i<n; i++)
            {
            nhacungcap= new nhacungcap();
            int maNCC = nhacungcap.getMaNCC();
            boolean add = NCC.add(nhacungcap);
            }
            }
            public void xuatnhacungcap()
            {
            for(nhacungcap x: NCC)
            {
            x.xuatnhacungcap();
            }
            }
            @Override
            public void xuat()
            {
            super.xuat();
            System.out.println("{Gia nhap: "+ getgiathanh()+ ", ngay nhap : "+
            getngaynhap());
            xuatnhacungcap();
            }
}


