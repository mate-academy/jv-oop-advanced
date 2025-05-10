package core.basesyntax;

public class RightTriangle extends Figure {
    private double side;

    public RightTriangle(String name, String color, double side) {
        super(name, color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double obtainArea() {
        return Math.ceil((Math.sqrt(3) * Math.pow(side, 2)) / 4);
    }

    public void draw() {
        System.out.println("Figure: " + getName() + ", "
                    + "color: " + getColor() + ", "
                    + "side: " + getSide() + " " + "units, "
                    + "area: " + obtainArea() + " " + "sq.units");
    }
}
