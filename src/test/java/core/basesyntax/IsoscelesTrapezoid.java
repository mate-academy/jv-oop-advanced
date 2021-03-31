package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int side1;
    private int side2;
    private int height;

    public IsoscelesTrapezoid(String color, int side2,  int side1, int height) {
        super("trapezoid",color);
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1){
        this.side1 = side1;
    }

    public int getSide2(){
        return side2;
    }

    public void setSide2(int side2){
        this.side2 = side2;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((side1+side2) * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() +
                ", area: " + getArea() +
                " sq. units , side1 length: " + getSide1() +
                " units, side2 length: " + getSide2() +
                " units, height length: " + getHeight() +
                " units, color: " + getColor());
    }
}
