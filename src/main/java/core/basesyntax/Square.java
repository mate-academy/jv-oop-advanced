package core.basesyntax;

public class Square extends Figure {
    private final double leg;

    public Square(double leg, String color) {
        super(color);
        this.leg = leg;
    }

    @Override
    public double getArea() {
        return leg * leg;
    }

    @Override
    public void draw() {
        System.out.println("Figure" + " " + "Square" + " " + "Leg" + " " + leg + " "
                + "Area" + " " + getArea() + " " + "Color" + " " + color);
    }
}
