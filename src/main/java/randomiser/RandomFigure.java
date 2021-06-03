package randomiser;

import figures.Circle;
import figures.Figure;
import figures.IsoscelesTrapezoid;
import figures.Rectangle;
import figures.RightTriangle;
import figures.Square;

public class RandomFigure {
    private static final int COUNT_FIGURES = 5;
    private static final int LIMIT = 25;
    private RandomUtil randomUtil;
    private RandomColor randomColor;

    public RandomFigure() {
        randomUtil = new RandomUtil();
        randomColor = new RandomColor();
    }

    public Figure[] getRandomFigures() {
        Figure[] figures = new Figure[LIMIT];
        for (int i = 0; i < LIMIT; i++) {
            figures[i] = getRandomFigure();
        }
        return figures;
    }

    private Figure getRandomFigure() {
        int randomIndex = randomUtil.getRandomIndex(COUNT_FIGURES);
        switch (randomIndex) {
            case 0:
                return new IsoscelesTrapezoid(randomColor.getRandomColor(),
                    randomUtil.getDouble(LIMIT),
                    randomUtil.getDouble(LIMIT),
                    randomUtil.getDouble(LIMIT));
            case 1:
                return new Circle(randomColor.getRandomColor(), randomUtil.getRandomIndex(LIMIT));
            case 2:
                return new Square(randomColor.getRandomColor(), randomUtil.getDouble(LIMIT));
            case 3:
                return new RightTriangle(randomColor.getRandomColor(), randomUtil.getDouble(LIMIT),
                    randomUtil.getDouble(LIMIT));
            default:
                return new Rectangle(randomColor.getRandomColor(), randomUtil.getDouble(LIMIT),
                    randomUtil.getDouble(LIMIT));
        }
    }
}
