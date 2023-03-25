package lab5.cau2;

public class HinhTron extends Hinh {
     private float r;
    public void  Hinhtron(float r){
        this.r=r;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }
    public double dientich(){
        return Math.PI*r;
    }
}

