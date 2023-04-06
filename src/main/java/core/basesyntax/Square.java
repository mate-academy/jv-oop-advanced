package core.basesyntax;

import java.util.Random;

public class Square extends Figure {
    private double side;
    private Random random = new Random();

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    public Square() {
        setColor(random);
        this.color = getColor();
        side = random.nextDouble();
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units, side: " + side
                + " units, color: " + color);
    }
}
