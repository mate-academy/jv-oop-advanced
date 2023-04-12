package core.basesyntax;

public class Rectangle implements Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double gerArea() {
        return width * height;
    }

    public void draw() {
        System.out.println(gerArea());
    }
}
