package core.basesyntax;

public class IsoscelesTrapezoid extends ColorFigure implements FigureInfo, Figure { //s = (a+b)/2 * h
    private double a;
    private double b;
    private double h;

    public IsoscelesTrapezoid(double a, double b, double h, String color) {
        this.a = a;
        this.b = b;
        this.h = h;
        this.color = color;
    }
    @Override
    public double getArea() {
        return (a + b)/2 * h;
    }

    @Override
    public void draw() {
        System.out.println("Figure:isosceles trapezoid, area " + getArea() + "sq.units, " + "firstLeg: " + a + "units" +
                "secondLeg: " + b + "units ," + "height: " + h + "units ," + "color: " + color);
    }

}

