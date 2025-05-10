package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_TYPES = 5;
    private static final int DEFAULT_FIGURE_RADIUS = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_TYPES);
        Color color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                return new Circle(color,random.nextDouble(50));
            case 1:
                return new Rectangle(color,random.nextDouble(50),random.nextDouble(50));
            case 2:
                return new RightTriangle(color, random.nextDouble(50),random.nextDouble(50));
            case 3:
                return new Square(color,random.nextDouble(50));
            case 4:
                return new IsoscelesTrapezoid(color,random.nextDouble(50),random.nextDouble(50),
                        random.nextDouble(50),random.nextDouble(50));
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {

        return new Circle(Color.WHITE,DEFAULT_FIGURE_RADIUS);
    }
}
