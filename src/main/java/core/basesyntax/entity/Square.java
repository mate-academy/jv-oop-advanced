package core.basesyntax.entity;

public class Square extends Rectangle{

    public Square(double side, Color color) {
        super(side, side, color);
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + String.format("%.1f", getArea())
                + " sq.units, side: " + String.format("%.1f", this.width) + " units, color: " + this.color);
    }
}
