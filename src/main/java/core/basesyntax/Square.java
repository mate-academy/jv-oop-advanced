package core.basesyntax;

public class Square extends ColorSupplier implements Figure {
    private double side = Math.random() * 10;

    @Override
    public String informationFigure() {
        System.out.printf("Figure: square, area: %.1f", getArea());
        System.out.printf(" sq.units, side: %.1f", side);
        System.out.println(" units, color: " + getRandomColor());
        return null;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
