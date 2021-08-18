package core.basesyntax;

public class Circle extends ColorSupplier implements Figure {
    private double radius = Math.random() * 10;

    @Override
    public String informationFigure() {
        System.out.printf("Figure: circle, area: %.1f", getArea());
        System.out.printf(" sq.units, radius: %.1f", radius);
        System.out.printf(" units, diagonal: %.1f", radius * 2);
        System.out.println(" units, color: " + getRandomColor());
        return null;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
