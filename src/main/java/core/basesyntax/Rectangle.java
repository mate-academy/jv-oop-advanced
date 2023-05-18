package core.basesyntax;

public class Rectangle extends FigureAbstract implements Figure {
    private final int width;
    private final int length;

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
    public String toString() {
        return "Figure:Rectangle," +
                "area:" + getArea() +
                " sq.units,width:" + width +
                " units,length:" + length +
                " units,color:" + color;

    }
}
