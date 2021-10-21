package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Figure figure;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        Figure circle = new Circle(10);
        circle.setColor("WHITE");
        return circle;
    }

    public Figure getRandomFigure() {
        Figures[] values = Figures.values();
        Random random = new Random();
        switch (random.nextInt(values.length)) {
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
        Random random = new Random();
        float radius = 20 * random.nextFloat();
        Figure figure = new Circle(radius);
        return figure;
    }

    public Figure getRandomIsoscelesTrapezoid() {
        Random random = new Random();
        float innerSide = 20 * random.nextFloat();
        float downSide = 20 * random.nextFloat();
        float heightTrapezoid = 20 * random.nextFloat();
        Figure figure = new IsoscelesTrapezoid(innerSide, downSide, heightTrapezoid);
        return figure;
    }

    public Figure getRandomRectangle() {
        Random random = new Random();
        float firstLeg = 20 * random.nextFloat();
        float secondLeg = 20 * random.nextFloat();
        Figure figure = new Rectangle(firstLeg, secondLeg);
        return figure;
    }

    public Figure getRandomRightTriangle() {
        Random random = new Random();
        float firstLeg = 20 * random.nextFloat();
        float secondLeg = 20 * random.nextFloat();
        Figure figure = new Rectangle(firstLeg, secondLeg);
        return figure;
    }

    public Figure getRandomSquare() {
        Random random = new Random();
        float side = 20 * random.nextFloat();
        Figure figure = new Square(side);
        return figure;
    }

}
