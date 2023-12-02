package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topSide;
    private int bottomSide;
    private int height;

    public IsoscelesTrapezoid(String color, int topSide, int bottomSide, int height) {
        super(color);
        this.bottomSide = bottomSide;
        this.topSide = topSide;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("I am isosceles trapezoid, my area is: " + getArea()
                + " my top side, bottow side and height: " + topSide
                + " " + bottomSide + " " + height
                + ", color is " + getColor());
    }

    @Override
    public double getArea() {
        return ((topSide + bottomSide) / 2) * height;
    }
}
