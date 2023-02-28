package khocaycanh;
    import java.util.Scanner;       
    import java.io.Serializable;
public class caycanh implements Serializable{
    private String tencay,phanloai,MaCC;
    private int soluong;
   public caycanh(String tencay, String phanloai,String MaCC ,int soluong)
    {
        this.tencay= tencay;
        this.phanloai= phanloai;
        this.MaCC= MaCC;
        this.soluong=soluong;
    }
    public String gettencay (){
       return tencay; 
    }
    public void settencay(String tencay) 
    {
        this.tencay = tencay;
    }
    public String getphanloai() {
        return phanloai;
        }
        public void setphanloai(String phanloai) {
        this.phanloai = phanloai;
        }
        public String getMaCC() {
        return MaCC;
        }
        public void setMaCC(String  MaCC) {
        this.MaCC = MaCC;
        }
        public void setsoluong(int queQuan) {
            this.soluong = soluong;
            }
            public int getsoluong() {
            return soluong;
            }
      public void nhap()
      {
          Scanner input= new Scanner(System.in);
          System.out.println("nhập tên cây:");
          tencay= input.nextLine();
          System.out.println("nhập loại cây:");
          phanloai=input.nextLine();
          System.out.println("nhập mã cây:");
          MaCC=input.nextLine();
          System.out.println("Nhập số lượng cây ");
          soluong=input.nextInt(soluong);
      }
       public void xuat(){
           System.out.print("{\", MaCC: \"+ getMaCC()+ tencay: "+ gettencay() + ", phanloai: "+
                    getphanloai() + ", soluong: "+
                    getsoluong() + "}");
       }          
}
