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
        setArea(calculateArea());
    }

    @Override
    public double calculateArea() {
        return (firstSide + secondSide) / height * 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName()
                + ", color: " + getColor() + ", area: "
                + getArea() + " sq. units, first side: "
                + firstSide + " units, second side: "
                + secondSide + " units, height: " + height + " units");
    }
}
