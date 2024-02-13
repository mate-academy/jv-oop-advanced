package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final int MAX_LENGTH_SIDE = 10;
    private static final String COLOR = "WHITE";
    private static final short AMOUNT_OF_SHAPES = 5;

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        int rand = random.nextInt(AMOUNT_OF_SHAPES);

        Figure figure;

        switch (rand) {
            case 0:
                figure = new Circle(random.nextInt(MAX_LENGTH_SIDE) + 1,
                        colorSupplier.getRandomColor());
                break;
            case 1:
                int base = random.nextInt(MAX_LENGTH_SIDE) + 1;
                int top = random.nextInt(base) + 1;
                int height = random.nextInt(MAX_LENGTH_SIDE) + 1;
                figure = new IsoscelesTrapezoid(base, top, height, colorSupplier.getRandomColor());
                break;
            case 2:
                int length = random.nextInt(MAX_LENGTH_SIDE) + 1;
                int width = random.nextInt(MAX_LENGTH_SIDE) + 1;
                figure = new Rectangle(length, width, colorSupplier.getRandomColor());
                break;
            case 3:
                int base2 = random.nextInt(MAX_LENGTH_SIDE) + 1;
                int height2 = random.nextInt(MAX_LENGTH_SIDE) + 1;
                figure = new RightTriangle(base2, height2, colorSupplier.getRandomColor());
                break;
            case 4:
                int side = random.nextInt(MAX_LENGTH_SIDE) + 1;
                figure = new Square(side, colorSupplier.getRandomColor());
                break;
            default:
                figure = getDefaultFigure();
        }

        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(MAX_LENGTH_SIDE, COLOR);
    }
}
