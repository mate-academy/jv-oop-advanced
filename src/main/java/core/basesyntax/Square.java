package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String name, String color, double side) {
        super(name, color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double obtainArea() {
        return Math.pow(side, 2);
    }

    public void draw() {
        System.out.println("Figure: " + Square.this.getName() + ", "
                         + "color: " + Square.this.getColor() + ", "
                         + "side: " + Square.this.getSide() + " " + "units, "
                         + "area: " + obtainArea() + " " + "sq.units");
    }
}
