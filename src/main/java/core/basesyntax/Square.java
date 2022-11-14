package core.basesyntax;

public class Square extends ColorFigure implements Figure {//s = a*a
    private double a;

    public Square(double a, String color) {
        this.a = a;
        this.color = color;
     }

    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units, side: " + a + " units, color:" + color);
    }
}
//Figure: square, area: 25.0 sq.units, side: 5 units, color: blue