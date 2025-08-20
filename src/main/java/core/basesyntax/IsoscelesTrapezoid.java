package core.basesyntax;

public class IsoscelesTrapezoid implements Figure, Drawable {
    private final String color;
    private final int longerSide;
    private final int shorterSide;
    private final int height;

    public IsoscelesTrapezoid(String color, int longerSide, int shorterSide, int height) {
        this.color = color;
        this.height = height;
        this.shorterSide = shorterSide;
        this.longerSide = longerSide;
    }

    @Override
    public double getArea() {
        return (longerSide + shorterSide) * height * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea() + " sq. units, longerSide: "
                + longerSide + " units, shorterSide: " + shorterSide + " units, height: "
                + height + " units, color: " + color);
    }
}
