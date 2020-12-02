package core.basesyntax;

public class Rectangle extends Figure {

    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    public double getPerimeter() {
        return (sideA + sideB) * 2;
    }

    @Override
    public void draw() {
        System.out.println(getClass().getSimpleName() + ", area : " + getArea()
                + " sq. units, " + "Its' perimeter " + getPerimeter() + " units , color: "
                + this.getColor().toLowerCase());
    }

}
