package core.basesyntax;

public class Circle implements Figure {
    private double radius;

    @Override 
    public double getArea() {
        return 3.14 * (radius * radius);
    }

    @Override 
    public void draw() {
        System.out.println("Radius - " + radius);
    }
}
