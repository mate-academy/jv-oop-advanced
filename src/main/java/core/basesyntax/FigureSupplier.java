package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int RANDOM_BOARD = 100;

    public Figure getRandomFigure() {
        String color = new ColorSupplier().getRandomColor();
        Random random = new Random();
        Figure figure;
        switch (random.nextInt(FIGURE_COUNT)) {
            case 1:
                double side = random.nextInt(RANDOM_BOARD);
                figure = new Square(side, color);
                break;
            case 2:
                double side1 = random.nextInt(RANDOM_BOARD);
                double side2 = random.nextInt(RANDOM_BOARD);
                figure = new Rectangle(side1, side2, color);
                break;
            case 3:
                double firstLeg = random.nextInt(RANDOM_BOARD);
                double secondLeg = random.nextInt(RANDOM_BOARD);
                figure = new RightTriangle(firstLeg, secondLeg, color);
                break;
            case 4:
                double radius = random.nextInt(RANDOM_BOARD);
                figure = new Circle(radius, color);
                break;
            default:
                double firstBase = random.nextInt(RANDOM_BOARD);
                double secondBase = random.nextInt(RANDOM_BOARD);
                double height = random.nextInt(RANDOM_BOARD);
                figure = new IsoscelesTrapezoid(firstBase, secondBase, height, color);
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.name());
    }
}
