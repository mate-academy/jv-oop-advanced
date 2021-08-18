package core.basesyntax;

public class RightTriangle extends ColorSupplier implements Figure {
    private double firstLeg = Math.random() * 10;
    private double secondLeg = Math.random() * 10;

    @Override
    public String informationFigure() {
        System.out.printf("Figure: right triangle, area: %.1f", getArea());
        System.out.printf(" sq.units, length: %.1f", firstLeg);
        System.out.printf(" units, secondLeg: %.1f", secondLeg);
        System.out.println(" units, color: " + getRandomColor());
        return null;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }
}
