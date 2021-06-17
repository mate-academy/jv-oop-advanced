package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstSide;
    private double secondSide;
    private double height;

    public IsoscelesTrapezoid(String color, double firstSide, double secondSide, double height) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * ((firstSide + secondSide) / 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, area : " + getArea()
                + "sq. units, firstSide: " + firstSide
                + " units, secondSide: " + secondSide
                + " units, height: " + height
                + " units, color: " + getColor());
    }
}
