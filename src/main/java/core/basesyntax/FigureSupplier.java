package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    static final int DEFAULT_RADIUS = 10;
    static final int DEFAULT_SIDE = 15;
    static final int DEFAULT_FIRST_SIDE = 7;
    static final int DEFAULT_SECOND_SIDE = 5;
    static final int NUMBER_OF_DEFAULT_FIGURES = 3;
    static final int MAX_RANDOM_VALUE = 15;
    static final int NUMBER_OF_FIGURES = 5;
    static final String DEFAULT_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();


    public Figure getRandomFigure(){
        String randomColor = colorSupplier.getColorOfFigure();
        int randomFigure = random.nextInt(NUMBER_OF_FIGURES);

        switch (randomFigure) {
            case 0:
                return new Circle(random.nextInt(MAX_RANDOM_VALUE), randomColor);
            case 1:
                return new Rectangle(random.nextInt(MAX_RANDOM_VALUE),
                        random.nextInt(MAX_RANDOM_VALUE), randomColor);
            case 2:
                return new Square(random.nextInt(MAX_RANDOM_VALUE), randomColor);
            case 3:
                return new RightTriangle(random.nextInt(MAX_RANDOM_VALUE),
                        random.nextInt(MAX_RANDOM_VALUE), randomColor);
            case 4:
                return new IsoscelesTrapezoid(random.nextInt(MAX_RANDOM_VALUE),
                        random.nextInt(MAX_RANDOM_VALUE),
                        random.nextInt(MAX_RANDOM_VALUE), randomColor);
            default:
                return null;

        }
    }
    public Figure getDefaultFigure(){
        int randomFigure = random.nextInt(3);
        switch (randomFigure) {
            case 0:
                return new Square(DEFAULT_SIDE, DEFAULT_COLOR);
            case 1:
                return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
            case 2:
                return new RightTriangle(DEFAULT_FIRST_SIDE, DEFAULT_SECOND_SIDE, DEFAULT_COLOR);
            default:
                return null;
        }
    }
}
