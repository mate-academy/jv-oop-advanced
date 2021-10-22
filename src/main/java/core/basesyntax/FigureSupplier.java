package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private Figure figure;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private String color = colorSupplier.getRandomColor();

    public Figure getDefaultFigure() {
        Figure circle = new Circle(10, "WHITE");
        return circle;
    }

    public Figure getRandomFigure() {
        Random random = new Random();
        switch (random.nextInt(5)) {
            case 0:
                figure = getRandomCircle();
                break;
            case 1:
                figure = getRandomIsoscelesTrapezoid();
                break;
            case 2:
                figure = getRandomRectangle();
                break;
            case 3:
                figure = getRandomRightTriangle();
                break;
            case 4:
                figure = getRandomSquare();
                break;
            default:
        }
        return figure;
    }

    public Figure getRandomCircle() {
        float radius = 20 * random.nextFloat();
        return new Circle(radius, color);
    }

    public Figure getRandomIsoscelesTrapezoid() {
        float innerSide = 20 * random.nextFloat();
        float downSide = 20 * random.nextFloat();
        float heightTrapezoid = 20 * random.nextFloat();
        return new IsoscelesTrapezoid(innerSide, downSide, heightTrapezoid, color);
    }

    public Figure getRandomRectangle() {
        float firstLeg = 20 * random.nextFloat();
        float secondLeg = 20 * random.nextFloat();
        return new Rectangle(firstLeg, secondLeg, color);
    }

    public Figure getRandomRightTriangle() {
        float firstLeg = 20 * random.nextFloat();
        float secondLeg = 20 * random.nextFloat();
        return new RightTriangle(firstLeg, secondLeg, color);
    }

    public Figure getRandomSquare() {
        float side = 20 * random.nextFloat();
        return new Square(side, color);
    }

}
