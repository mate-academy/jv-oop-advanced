package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 20;
    private static final Random random = new Random();

    public Figure[] getRandomArrayOfFigures() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        Figure[] figures = new Figure[figureNumber];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = getRandomFigure();
        }
        return figures;
    }

    public Figure getRandomFigure() {
        String figureType = getRandomFigureType();
        switch (figureType) {
            case "square": return new Square(getRandomInt());
            case "rectangle": return new Rectangle(getRandomInt(), getRandomInt());
            case "circle": return new Circle(getRandomInt());
            case "right triangle": return new RightTriangle(getRandomInt(), getRandomInt());
            default: return new IsoscelesTrapezoid(getRandomInt(), getRandomInt(), getRandomInt());
        }
    }

    private int getRandomInt() {
        return random.nextInt(100) + 1;
    }

    private String getRandomFigureType() {
        int randomIndex = random.nextInt(FigureType.values().length);
        return FigureType.values()[randomIndex].getName();
    }
}
