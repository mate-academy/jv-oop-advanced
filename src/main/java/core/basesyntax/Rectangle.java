package core.basesyntax;

public class Rectangle extends Figure {

    private final int sideOne;
    private final int sideTwo;

    Rectangle(String color, int sideOne, int sideTwo) {
        super(color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    public double area() {
        return sideOne * sideTwo;
    }

    @Override
    public String getName() {
        return Figures.RECTANGLE.name().toLowerCase();
    }

    @Override
    public void infoAboutFigure() {
        System.out.println("Figure: " + getName() + ", " + area() + " sq.units, sideOne: "
                + sideOne + ", sideTwo: " + sideTwo + ", color: " + getColor());

    }
}
