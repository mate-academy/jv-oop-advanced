package core.basesyntax;

import java.util.Random;

public class Square extends Figure {
    private int side;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Square(int side, String color) {
        this.side = side;
        setColor(color);
    }

    public Square() {

    }

    public Square getRandomSquare() {
        String color = colorSupplier.getColorOfFigure();
        int side = new Random().nextInt(10);
        return new Square(side, color);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: square, side: " + side + ", area: " + getArea()
                + ", color: " + getColor());
    }
}
