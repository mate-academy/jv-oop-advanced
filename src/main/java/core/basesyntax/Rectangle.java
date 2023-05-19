package core.basesyntax;

public class Rectangle implements Figure {
    private final int width;
    private final int length;
    private final String color;

    public Rectangle(String color, int length, int width) {
        this.width = width;
        this.length = length;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (double) width * length;
    }

    @Override
    public void draw() {
        System.out.println("Figure:Rectangle," +
                "area:" + getArea() +
                " sq.units,width:" + width +
                " units,length:" + length +
                " units,color:" + color);
    }
}
