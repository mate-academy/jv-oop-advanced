package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstSide;
    private double secondSide;
    private double height;

    public IsoscelesTrapezoid(String color, double firstSide, double secondSide, double height) {
        setColor(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return Math.floor((((firstSide + secondSide) / 2) * height) * 100) / 100;
    }

    @Override
    public void draw() {
        System.out.println(" Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, firstSide: " + firstSide + " units, secondSide: "
                + secondSide + " units, height: " + height + " units, color: " + getColor());
    }
}
