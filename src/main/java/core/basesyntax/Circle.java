package core.basesyntax;

public class Circle extends Figure {
    int radius;

    public Circle() {
        super(ColorSupplier.getRandomColor());
        radius = FigureSupplier.getRandomLength();
    }

    @Override
    public String toString() {
        return "Figure: circle; " +
                this.drawArea() +
                "; radius: " + radius +
                "; colour: " + this.getColor() +
                ';';
    }

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String drawArea() {
        return  "area: " + Math.PI * radius * radius + " sq.units";
    }
}
