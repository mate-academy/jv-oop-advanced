package core.basesyntax;

public class Square extends Properties {
    private final int side = 5;

    @Override
    public double obtainArea() {
        return side * side;

    }

    @Override
    public void drawFigure() {
        System.out.println("Square, area: " + obtainArea() + " sq.units, side: "
                + side + " units, color: " + getColor());
    }

}
