package core.basesyntax;

public class RightTriangle extends Figure {
    private double sideOne;
    private double sideTwo;

    public RightTriangle(String color, double sideOne, double sideTwo) {
        super(color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    public void calculateSquare() {
        System.out.println("Square of RightTriangle = " + (sideOne * sideTwo) / 2);
    }

    @Override
    String getInfo() {
        return "Figure: RightTriangle, area: " + (sideOne * sideTwo) / 2
                + " sq.units, " + "sideOne " + sideOne + " units, " + "sideTwo "
                + sideTwo + " units, " + "color: " + getColor();
    }
}
