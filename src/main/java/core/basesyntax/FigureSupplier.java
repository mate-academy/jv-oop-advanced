package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int FIGURE_PROPERTY = 10;
    private Random random = new Random();
    private Figure figure;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT + 1);

        switch (figureNumber) {

            case 1: {
                int radius = random.nextInt(FIGURE_PROPERTY);
                String color = colorSupplier.getRandomColor();
                figure = new Circle(radius, color);
                break;
            }
            case 2: {
                int firstSide = random.nextInt(FIGURE_PROPERTY);
                int secondSide = random.nextInt(FIGURE_PROPERTY);
                int height = random.nextInt(FIGURE_PROPERTY);
                String color = colorSupplier.getRandomColor();
                figure = new IsoscelesTrapezoid(color, firstSide, secondSide, height);
                break;
            }
            case 3: {
                int firstSide = random.nextInt(FIGURE_PROPERTY);
                int secondSide = random.nextInt(FIGURE_PROPERTY);
                String color = colorSupplier.getRandomColor();
                figure = new Rectangle(color, firstSide, secondSide);
                break;
            }
            case 4: {
                int firstLeg = random.nextInt(FIGURE_PROPERTY);
                int secondLeg = random.nextInt(FIGURE_PROPERTY);
                String color = colorSupplier.getRandomColor();
                figure = new RightTriangle(color, firstLeg, secondLeg);
                break;
            }
            case 5: {
                int side = random.nextInt(FIGURE_PROPERTY);
                String color = colorSupplier.getRandomColor();
                figure = new Square(color, side);
                break;
            }
            default: {
                int side = random.nextInt(FIGURE_PROPERTY);
                String color = colorSupplier.getRandomColor();
                figure = new Square(color, side);
                break;
            }
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        int radius = 10;
        String color = "WHITE";
        figure = new Circle(radius, color);
        return figure;
    }
}
