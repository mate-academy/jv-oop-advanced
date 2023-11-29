package core.basesyntax;

import java.util.Random;

public class Square extends Figure {
    private int sideS;
    private String squareColor = new Figure().getColor();

    public Square(Random random) {
        this.sideS = Math.abs(random.nextInt());
        this.squareColor = ColorSupplier.getRandomColor();
        draw();
    }

    @Override
    public double getArea() {
        return sideS * sideS;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq. units, sideS: " + sideS
                + " units, color: " + squareColor);
    }
}
