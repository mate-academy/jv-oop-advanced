package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstSide;
    private double secondSide;
    private double height;

    public IsoscelesTrapezoid(double firstSide, double secondSide, double height, String color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return ((secondSide + firstSide) * height) / 2;
    }

    @Override
    public String draw() {
        String baseInfo = super.draw();
        return baseInfo + " first side: " + firstSide + " units "
                + ", second side: " + secondSide + " units "
                + ", height: " + height + " units ";
    }
}
