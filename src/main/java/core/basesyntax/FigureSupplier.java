package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_LIMIT = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomCase = random.nextInt(FIGURE_LIMIT) + 1;
        Figure figure = null;
        switch (randomCase) {
            case 1:
                figure = createCircle();
                break;
            case 2:
                figure = createIsoscelesTrapezoid();
                break;
            case 3:
                figure = createRectangle();
                break;
            case 4:
                figure = createRightTriangle();
                break;
            case 5:
                figure = createSquare();
                break;
            default:
                break;
        }
        return figure;
    }

    private Figure createCircle() {
        int radius = random.nextInt(100);
        String color = colorSupplier.getRandomColor();
        return new Circle(color, radius);
    }

    private Figure createIsoscelesTrapezoid() {
        int baseOne = random.nextInt(100);
        int baseTwo = random.nextInt(100);
        int height = random.nextInt(50);
        String color = colorSupplier.getRandomColor();
        return new IsoscelesTrapezoid(color, baseOne, baseTwo, height);
    }

    private Figure createRectangle() {
        int length = random.nextInt(100);
        int width = random.nextInt(100);
        String color = colorSupplier.getRandomColor();
        return new Rectangle(color, length, width);
    }

    private Figure createRightTriangle() {
        int firstLeg = random.nextInt(100);
        int secondLeg = random.nextInt(100);
        String color = colorSupplier.getRandomColor();
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Figure createSquare() {
        int side = random.nextInt(100);
        String color = colorSupplier.getRandomColor();
        return new Square(color, side);
    }
}

