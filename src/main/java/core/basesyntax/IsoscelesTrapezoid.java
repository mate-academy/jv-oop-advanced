package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double firstMainPart;
    private double secondMainPart;

    public IsoscelesTrapezoid(String color, double height, double firstMainPart,
                              double secondMainPart) {
        super(color);
        this.firstMainPart = firstMainPart;
        this.secondMainPart = secondMainPart;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((firstMainPart + secondMainPart) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, upper base: " + firstMainPart
                + " units, lower base: " + secondMainPart
                + " units, height: " + height + " units, color: " + getColor());
    }
}
