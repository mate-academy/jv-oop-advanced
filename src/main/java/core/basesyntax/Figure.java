package core.basesyntax;

public abstract class Figure implements GeometricObjectInfo {
    private Color color;
    private double area;

    public abstract double getArea();

    public abstract Color getColor();

}
