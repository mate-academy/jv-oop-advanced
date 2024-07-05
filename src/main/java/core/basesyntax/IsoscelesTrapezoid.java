package core.basesyntax;

public class IsoscelesTrapezoid {
    private int side1;
    private int side2;
    private int h;

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }

    public int getH() {
        return h;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getArea(){
        return (getSide1() * getSide2() * getH()) / 2;
    }
}
