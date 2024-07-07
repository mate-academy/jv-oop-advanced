package core.basesyntax;

public class Square extends Figure implements Drawable, AreaCalculator {
    private double side1;
    private double side2;

    public Square(double side1, double side2, Color color) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return getSide1() * getSide2();
    }


    @Override
    public void draw() {
        System.out.println("Figure square: area:" + getArea() + " sq. units, side1: " + getSide1() + " side2: " + getSide2() + " units, color: " + getColor());
    }
}
