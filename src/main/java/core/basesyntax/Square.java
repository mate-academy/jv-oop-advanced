package core.basesyntax;

import java.util.Random;

public class Square extends Figure implements FindArea {
    private int side;

    public Square() {
        super();
        this.side = new Random().nextInt(1, 10);
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.println("\nSquere "
                + "color: " + this.getColor()
                + " area: " + this.getArea()
                + " side: " + side);
    }
}
