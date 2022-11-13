package core.basesyntax;

public class Rectangle extends ColorFigure implements FigureInfo, Figure {//s =a*b;
    private double a;
    private double b;

    public Rectangle(double a, double b, String color) {
        this.a = a;
        this.b = b;
        this.color = color;
    }
    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: " + getArea() + "sq.units, " + "firstLeg: " + a + "units" +
                "secondLeg: " + b + "units ," + "color: " + color);
    }
}
//Figure: square, area: 25.0 sq.units, side: 5 units, color: blue