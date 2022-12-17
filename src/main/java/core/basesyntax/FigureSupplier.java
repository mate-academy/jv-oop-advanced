package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int QUANTITY_OF_FIGURES = 5;
    private static final int MAX_SIDE_VALUE = 500;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        return generateFigure(colorSupplier.getRandomColor());
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE,10);
    }

    private Figure generateFigure(Color color) {
        int figure1 = random.nextInt(QUANTITY_OF_FIGURES);
        switch (figure1) {
            case 0:
                return new Square(color, random.nextInt(MAX_SIDE_VALUE));
            case 1:
                return new Rectangle(color, random.nextInt(MAX_SIDE_VALUE),
                        random.nextInt(MAX_SIDE_VALUE));
            case 2:
                return new RightTriangle(color, random.nextInt(MAX_SIDE_VALUE),
                        random.nextInt(MAX_SIDE_VALUE));
            case 3:
                return new Circle(color, random.nextInt(MAX_SIDE_VALUE));
            case 4:
            default:
                return new IsoscelesTrapezoid(color, random.nextInt(MAX_SIDE_VALUE),
                        random.nextInt(MAX_SIDE_VALUE), random.nextInt(MAX_SIDE_VALUE));
        }
    }
}
