package core.basesyntax;

public class Rectangle extends ColorSupplier implements Figure {
    private double length = Math.random() * 10;
    private double width = Math.random() * 10;

    @Override
    public String informationFigure() {
        System.out.printf("Figure: rectangle, area: %.1f", getArea());
        System.out.printf(" sq.units, length: %.1f", length);
        System.out.printf(" units, secondLeg: %.1f", width);
        System.out.println(" units, color: " + getRandomColor());
        return null;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
