package core.basesyntax;

import java.util.Locale;

class Square implements Figure {
    private final double side;
    private final String color;

    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    public double getSide() {
        return side;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println(String.format(Locale.US,
                "Figure: square, area: %.2f sq. units, side: %.1f units, "
                        + "color: %s",
                getArea(), side, color));
    }
}
