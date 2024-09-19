package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstSide;
    private double secondSide;
    private double height;

    public IsoscelesTrapezoid(double firstSide, double secondSide, double height, Color color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    public void setFirstSide(double firstSide) {
        if (firstSide <= 0) {
            System.out.println("Gometric value need to be greater than zero");
        } else {
        this.firstSide = firstSide;
        }
    }

    public void setSecondSide(double secondSide) {
        if (secondSide <= 0) {
            System.out.println("Gometric value need to be greater than zero");
        } else {
            this.secondSide = secondSide;
        }
    }

    public void setHeight(double height) {
        if (height <= 0) {
            System.out.println("Gometric value need to be greater than zero");
        } else {
            this.height = height;
        }
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return (firstSide + secondSide) * height * 0.5;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: isosceles trapezoid, area: " + getArea() + " sq. units"
                        + ", first side: " + firstSide + " units"
                        + ", second side: " + secondSide + " units"
                        + ", height: " + height + " units"
                        + ", color: " + getColor());
    }
}
