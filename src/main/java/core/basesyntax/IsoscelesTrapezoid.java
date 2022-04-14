package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
double largeBase;
double smallBase;
double side;
double height;
public IsoscelesTrapezoid(double largeBase, double smallBase, double height) {
    this.largeBase = largeBase;
    this.smallBase = smallBase;
    this.height = height;
    this.square = 0.5 * (largeBase + smallBase) * height;
}
    @Override
    public double getSquare() {
        square = 0.5 * (largeBase + smallBase) * height;
        return square;
    }
    public void printSquareInfo() {
        System.out.println("Figure: isosceles trapezoid\narea: " + square + " sq.units\nlarge base: " + largeBase + " units\nsmall base: " + smallBase + " units\nheight: " + height + " units\ncolor: " + color);
    }
}
