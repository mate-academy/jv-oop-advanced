package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int fistSide;
    private int secondSide;
    private int height;

    public IsoscelesTrapezoid(int fistSide, int secondSide, int height, Color color) {
        this.fistSide = fistSide;
        this.secondSide = secondSide;
        this.height = height;
        super.color = color;
    }

    public void setFistSide(int fistSide) {
        this.fistSide = fistSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getFistSide() {
        return fistSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double area() {
        return ((fistSide + secondSide) * height / 2);
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: isosceles trapezoid, area: " + area() + " sq. units"
                        + ", first side: " + fistSide + " units"
                        + ", second side: " + secondSide + " units"
                        + ", height: " + height + " units"
                        + ", color: " + color);
    }
}
