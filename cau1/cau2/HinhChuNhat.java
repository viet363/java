package lab5.cau2;

public class HinhChuNhat extends Hinh {
     private float cd;
    private float cr;
    public void Hinhchunhat(float cd, float cr){
        this.cd=cd;
        this.cr=cr;
    }
    
    public String toString(){
        
        return cd+","+cr;
        
    }
    @Override
    public double dientich(){
        return cd*cr;
    }
}

