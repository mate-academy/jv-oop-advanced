package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Figure figure;
    private ColorSupplier colorSupplier = new ColorSupplier();
    String color = colorSupplier.getRandomColor();
    Random random = new Random();

    public Figure getDefaultFigure() {
        Figure circle = new Circle(10);
        circle.setColor("WHITE");
        return circle;
    }

    public Figure getRandomFigure() {
        Random random = new Random();
        switch (random.nextInt(5)) {
            case 0:
                figure = getRandomCircle();
                figure.setColor(color);
                break;
            case 1:
                figure = getRandomIsoscelesTrapezoid();
                figure.setColor(color);
                break;
            case 2:
                figure = getRandomRectangle();
                figure.setColor(color);
                break;
            case 3:
                figure = getRandomRightTriangle();
                figure.setColor(color);
                break;
            case 4:
                figure = getRandomSquare();
                figure.setColor(color);
                break;
            default:
        }
        return figure;
    }

    public Figure getRandomCircle() {
        float radius = 20 * random.nextFloat();
        return new Circle(radius);
    }

    public Figure getRandomIsoscelesTrapezoid() {
        float innerSide = 20 * random.nextFloat();
        float downSide = 20 * random.nextFloat();
        float heightTrapezoid = 20 * random.nextFloat();
        return new IsoscelesTrapezoid(innerSide, downSide, heightTrapezoid);
    }

    public Figure getRandomRectangle() {
        float firstLeg = 20 * random.nextFloat();
        float secondLeg = 20 * random.nextFloat();
        return new Rectangle(firstLeg, secondLeg);
    }

    public Figure getRandomRightTriangle() {
        float firstLeg = 20 * random.nextFloat();
        float secondLeg = 20 * random.nextFloat();
        return new RightTriangle(firstLeg, secondLeg);
    }

    public Figure getRandomSquare() {
        float side = 20 * random.nextFloat();
        return new Square(side);
    }

}
