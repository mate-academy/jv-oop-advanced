package core.basesyntax;

public class RightTriangle extends ColorFigure implements  Figure { //s = (a*b)/2
    private double a;
    private double b;

    public RightTriangle(double a, double b, String color) {
        this.a = a;
        this.b = b;
        this.color = color;
    }
    @Override
    public double getArea() {
        return (a * b)/2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + "sq.units, " + "firstLeg: " + a + "units" +
                "secondLeg: " + b + "units ," + "color: " + color);
    }
}
//Figure: triangle, area: 12.5 sq.units, firstLeg: 7 units, secondLeg: 5 units, color: yellow