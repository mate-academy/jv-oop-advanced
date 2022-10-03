package core.basesyntax;

public class RightTriangle extends Figure {

    private double sideTwo;
    private double sideOne;

    public RightTriangle(String color, double sideOne, double sideTwo) {
        super(color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    public RightTriangle() {

    }

    public double calcArea() {
        return super.setArea((this.sideTwo * this.sideOne)/2);
    }

    @Override
    public String toString() {
        String a = "abc";
        return "Figure: RightTriangle, " +
                "area: " + calcArea() +
                " sq.units, sideOne: " +
                sideOne  +
                " units, sideTwo " +
                sideTwo +
                " units, color: " +
                super.getColor();
    }
}