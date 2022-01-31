package core.basesyntax.entity;

public class Square extends Rectangle{

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq.units, side: " + this.width + " units, color: " + this.color);
    }
}
