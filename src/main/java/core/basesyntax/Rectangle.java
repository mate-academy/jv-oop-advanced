package core.basesyntax;

public class Rectangle extends Figure implements GetArea{

    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public String draw() {
        return "Figure : Rectangle, area : "
                + getArea()
                + ", sideA : "
                + sideA
                + ", sideB : "
                + sideB
                + ", color : "
                + super.getColor();
    }
}
