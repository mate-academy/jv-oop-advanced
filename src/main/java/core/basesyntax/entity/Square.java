package core.basesyntax.entity;

public class Square extends Rectangle{

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq.units, side: " + this.width + " units, color: " + this.color);
    }
}
