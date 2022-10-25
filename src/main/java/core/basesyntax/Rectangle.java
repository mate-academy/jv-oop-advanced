package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(String name, double length, double width, String color) {
        super(name, color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double obtainTheArea() {
        return length * width;
    }

    @Override
    public void toDrawFigure() {
        System.out.println("Figure: " + super.getName().toLowerCase() + ", area: " + obtainTheArea()
                        + " sq.units, length: " + this.length + " units, width: " + this.width
                        + " units, color: " + super.getColor().toLowerCase());
    }
}
