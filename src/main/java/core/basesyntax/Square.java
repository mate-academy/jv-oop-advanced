package core.basesyntax;

public class Square implements Figure {
    private String color;
    private double sideLength;

    public Square(String string, double sideLength) {
        this.color = color;
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public void draw() {
        System.out.println("Figure square,area:" + getArea() +
                "sq.units,side:" + sideLength + "units,color:" + color);
    }
}
