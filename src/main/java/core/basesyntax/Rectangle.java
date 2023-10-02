package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure {
    private double rectangleSideOne;
    private double rectangleSideTwo;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Rectangle(double area, String color, double rectangleSideOne, double rectangleSideTwo) {
        super(area, color);
        this.rectangleSideOne = rectangleSideOne;
        this.rectangleSideTwo = rectangleSideTwo;
    }

    public Rectangle() {

    }

    @Override
    public double countArea() {
        return getRectangleSideOne() * getRectangleSideTwo();
    }

    public double getRectangleSideOne() {
        return rectangleSideOne;
    }

    public double getRectangleSideTwo() {
        return rectangleSideTwo;
    }

    @Override
    public void draw() {
        Rectangle randomRectangle = getRandomRectangle();
        System.out.println("Figure: rectangle, area: "
                + randomRectangle.countArea() + " sq.units, sides: "
                + randomRectangle.getRectangleSideOne() + " units, "
                + randomRectangle.getRectangleSideTwo() + " units, color: "
                + colorSupplier.getRandomColor());
    }

    public Rectangle getRandomRectangle() {
        return new Rectangle(countArea(), colorSupplier.getRandomColor(),
                random.nextInt(100), random.nextInt(100));
    }
}
