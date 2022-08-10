package core.basesyntax;

public class IsoscelesTrapezoid extends Properties {
    private final int topLength = 5;
    private final int bottomLength = 10;
    private final int height = 4;

    @Override
    public double obtainArea() {
        return ((topLength + bottomLength) * height) / 2.0;

    }

    @Override
    public void drawFigure() {

        System.out.println("Isosceles Trapezoid, area: " + obtainArea() + " sq.units, topLength: "
                + topLength + " units, bottomLength: "
                + bottomLength + " units, height: " + height + " units, color: " + getColor());

    }

}
