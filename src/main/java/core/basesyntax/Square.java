package core.basesyntax;

public class Square extends Figure {
    private double sideA;

    public Square() {

    }

    public Square(String color, double sideA) {
        this.sideA = sideA;
        setColor(color);
    }

    @Override
    public double getArea() {
        return sideA * sideA;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area = " + getArea()
                + " sq. units, side a = " + sideA + " units, "
                + " color = " + getColor());
    }

}
