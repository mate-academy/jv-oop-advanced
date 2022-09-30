package core.basesyntax;

import java.util.Random;

public class FigureSuplier {
    public static final int FIGURE_COUNT = 5;
    public static final int RANDOM_LIMIT = 47;
    private static final int DEFOLT_RADIUS = 10;
    private static final String DEFOLT_COLOR = "white";
    private Random random;
    private ColorSuplier colorSuplier;

    public FigureSuplier(Random random, ColorSuplier colorSuplier) {
        this.random = random;
        this.colorSuplier = colorSuplier;
    }

    public int getRandomValues() {
        return random.nextInt(RANDOM_LIMIT);
    }

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(FIGURE_COUNT);
        String figureColor = colorSuplier.getRandomColor();

        switch (figureIndex) {
            case 0 :
                return new Circle(figureColor, getRandomValues());
            case 1 :
                return new IsoscelesTrapezoid(figureColor, getRandomValues(),
                        getRandomValues(), getRandomValues());
            case 2:
                return new Rectangle(figureColor, getRandomValues(), getRandomValues());
            case 3:
                return new RightTriangle(figureColor, getRandomValues(), getRandomValues());
            default :
                return new Square(figureColor, getRandomValues());

        }

    }

    public Figure getDefaultFigure() {
        return new Circle(DEFOLT_COLOR, DEFOLT_RADIUS);
    }
}
