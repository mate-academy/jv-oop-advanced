package core.basesyntax;

public class IsoscelesTrapezoid extends ColorSupplier implements Figure {
    private double height = Math.random() * 10;

    @Override
    public String informationFigure() {
        System.out.printf("Figure: isosceles trapezoid, area: %.1f", getArea());
        System.out.printf(" sq.units, height: %.1f", height);
        System.out.println(" units, color: " + getRandomColor());
        return null;
    }

    @Override
    public double getArea() {
        return height * height;
    }
}
