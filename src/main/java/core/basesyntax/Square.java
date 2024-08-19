package core.basesyntax;

public class Square extends Figure {
    public double side;

    public Square(String color, double side) {
        super(color);

        this.side = side;
    }

    @Override
    public void drawArea() {
        double area = this.side * this.side;

        System.out.println("Figure: square, " + "area: " + area + " sq. units, side: " + this.side + " units, color: " + this.color);
    }
}
