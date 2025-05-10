package core.basesyntax;

public class Square extends Default {
    private double size;

    public Square(String color,double size) {
        super(color);
        this.size = size;
    }

    @Override
    public double getProperty() {
        return 4 * size;
    }

    @Override
    public double getArea() {
        return size * size;
    }

    @Override
    public void draw() {
        System.out.println("Square: color = " + getColor()
                + ", size = " + Math.round(size)
                + ", Perimeter = " + Math.round(getProperty()));
    }
}
