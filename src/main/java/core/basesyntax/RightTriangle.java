package core.basesyntax;

public class RightTriangle extends Figure {
    private double sideOne;
    private double sideTwo;

    public RightTriangle(String color, String name, double sideOne, double sideTwo) {
        super(color, name);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + " area: " + calculateArea() + " sideOne: "
                + sideOne + " sideTwo: " + sideTwo + " color: " + color);
    }

    @Override
    public double calculateArea() {
        return (sideOne * sideTwo) / 2;
    }
}
