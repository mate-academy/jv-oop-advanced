package core.basesyntax;

public class Circle extends FigureAbstract implements Figure {
    private final int radius;

    public Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (int) Math.PI * radius * radius;
    }


    @Override
    public String toString() {
        return "Figure:Circle," +
                "area:" + getArea() + " sq.units,radius:" +
                radius + " units,color:" + color;
    }
}
