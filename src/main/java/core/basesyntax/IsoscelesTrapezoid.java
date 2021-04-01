package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideOne;
    private double sideTwo;
    private double height;

    public IsoscelesTrapezoid(String color, String figuresName,
                              double sideOne, double sideTwo,
                              double height) {
        super(color, figuresName);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((sideOne * sideTwo) / 2 * height);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getName() + ", area: " + getArea()
                + " sq. units, first side length: " + sideOne
                + " units, second side length: " + sideTwo + " units, height: " + height
                + " units, color: " + getColor());
    }
}
