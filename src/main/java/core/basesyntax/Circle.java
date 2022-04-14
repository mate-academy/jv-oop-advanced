package core.basesyntax;

public class Circle extends Figure {
    double radius;
public Circle (double radius) {
this.radius = radius;
this.square = Math.PI * radius * radius;
}
    @Override
    public double getSquare() {
        square = Math.PI * radius * radius;
        return square;
    }

    @Override
    public void printSquareInfo() {
        System.out.println("Figure: circle\narea: " + square + " sq.units\nradius: " + radius + " units\ncolor: " + color);
    }
}
