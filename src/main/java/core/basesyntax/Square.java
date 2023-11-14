package core.basesyntax;

public class Square extends Figure implements AreaCalculaton, PrintInfo {
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
    public String getInformation() {
        return "Figure" + " " + "Square" + " " + "Leg" + " " + leg + " "
                + "Area" + " " + getArea() + " " + "Color" + " " + color;
    }
}
