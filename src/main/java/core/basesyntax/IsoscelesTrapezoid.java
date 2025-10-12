package core.basesyntax;

import java.util.Locale;

class IsoscelesTrapezoid implements Figure {
    private final double topBase;
    private final double bottomBase;
    private final double height;
    private final String color;

    public IsoscelesTrapezoid(double topBase, double bottomBase, double height, String color) {
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
        this.color = color;
    }

    public double getTopBase() {
        return topBase;
    }

    public double getBottomBase() {
        return bottomBase;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return (topBase + bottomBase) * height / 2.0;
    }

    @Override
    public void draw() {
        System.out.println(String.format(Locale.US,
                "Figure: isosceles trapezoid, area: %.2f sq. units, topBase: %.1f units, "
                        + "bottomBase: %.1f units, height: %.1f units, color: %s",
                getArea(), topBase, bottomBase, height, color));
    }
}
