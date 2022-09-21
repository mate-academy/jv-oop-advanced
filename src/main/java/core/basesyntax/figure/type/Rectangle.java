package core.basesyntax.figure.type;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(String color, int side1, int side2) {
        super(color);
        this.firstSide = side1;
        this.secondSide = side2;
    }

    public int getSide1() {
        return firstSide;
    }

    public void setSide1(int side1) {
        this.firstSide = side1;
    }

    public int getSide2() {
        return secondSide;
    }

    public void setSide2(int side2) {
        this.secondSide = side2;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure Rectangle, measure: " + getArea() + ", Color: " + getColor());
    }
}
