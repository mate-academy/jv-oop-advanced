package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_RADIUS = 10;
    private static final int FIGURES_QUANTITY = 5;
    private static final int MAX_NUMBER = 20;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();
        int randomFigure = random.nextInt(FIGURES_QUANTITY);

        switch (randomFigure) {
            case 0:
                return new Square(random.nextInt(MAX_NUMBER), randomColor);
            case 1:
                return new Rectangle(random.nextInt(MAX_NUMBER), random.nextInt(MAX_NUMBER),
                        randomColor);
            case 2:
                return new RightTriangle(random.nextInt(MAX_NUMBER), random.nextInt(MAX_NUMBER),
                        randomColor);
            case 3:
                return new Circle(random.nextInt(MAX_NUMBER), randomColor);
            case 4:
                return new IsoscelesTrapezoid(random.nextInt(MAX_NUMBER),
                        random.nextInt(MAX_NUMBER), random.nextInt(MAX_NUMBER),
                        randomColor);
            default:
                return getDefaultFigure();
        }
    }
}
