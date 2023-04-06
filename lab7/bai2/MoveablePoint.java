package lab7.bai2;

import lab7.bai2.Moveable;

public class MoveablePoint implements Moveable{
        public int x;
        public int y;
        public int xSpeed;
        public int ySpeed;

    public MoveablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
        
    @Override
    public String toString() {
        return "MoveablePoint{" + "x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + '}';
    }
      
    @Override
    public void moveUp() {
        
    }
    

    @Override
    public void moveDown() {
        
    }

    @Override
    public void moveLeft() {
        
    }

    @Override
    public void moveRight() {
        
    }
}
