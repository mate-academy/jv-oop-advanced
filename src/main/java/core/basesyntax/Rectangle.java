package core.basesyntax;

public class Rectangle extends Figure {
    private double sideOne;
    private double sideTwo;

    public Rectangle(String color, double sideOne, double sideTwo) {
        super(color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    public void calculateSquare() {
        System.out.println("Square of Rectangle = " + sideOne * sideTwo);
    }

    @Override
    String getInfo() {
        return "Figure: Rectangle, area: " + sideOne * sideTwo
                + " sq.units, " + "sideOne " + sideOne + " units, " + "sideTwo "
                + sideTwo + " units, " + "color: " + getColor();
    }
}
