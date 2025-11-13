package core.basesyntax;

public class Square extends Figure {

    private double side;
    private final String name = "Square";

    public Square(double side, String kolor) {
        this.side = side;
        this.kolor = kolor;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + ", area: " + getArea() + " sq. units, "
                + side + "units, " + kolor);
    }
}
