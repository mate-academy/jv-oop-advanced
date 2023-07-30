package core.basesyntax;

public class Square extends Rectangle {
    public Square(double side, String color) {
        super(side, side, color);
    }

    public void draw() {
        System.out.printf("Figure: %1$s, area: %2$.1f %3$s, side: %4$.1f %5$s, color: %6$s%n",
                getClass().getSimpleName().toLowerCase(),
                super.getArea(),
                "sq." + super.getMeasureUnit(getArea()),
                super.getFirstSide(),
                super.getMeasureUnit(getFirstSide()),
                super.getColor());
    }
}
