package core.basesyntax;

public class RightTriangle extends Figure {
    private double side;

    public RightTriangle(double side, String color) {
        this.side = side;
        setColor(color);
    }

    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure : RightTriangle " + "color: " + getColor()
                + " side " + String.format("%.2f", side)
                + " area: " + String.format("%.2f", getArea()) + '}');
    }
}

