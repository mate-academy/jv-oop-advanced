package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(Color color, double side) {
        this.color = color;
        this.side = side;
    }

    public Color getColor(String color) {
        return this.color;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return this.side * this.side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                            + this.calculateArea()
                            + " sq.units, side: "
                            + this.getSide()
                            + " units, color: "
                            + this.getColor()
                            + "\n");
    }
}
