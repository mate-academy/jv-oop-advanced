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
        int randomIndex;
        Color color;

        for (int i = 0; i < LIMIT; i++) {
            randomIndex = randomUtil.getRandomIndex(COUNT_FIGURES);
            color = this.randomColor.getRandomColor();
            getRandomFigure(figures, randomIndex, color, i);
        }
        return figures;
    }

    private void getRandomFigure(Figure[] figures, int randomIndex, Color color, int i) {
        switch (randomIndex) {
            case 0:
                figures[i] = new IsoscelesTrapezoid(color,
                    randomUtil.getDouble(LIMIT),
                    randomUtil.getDouble(LIMIT),
                    randomUtil.getDouble(LIMIT));
                break;
            case 1:
                figures[i] = new Circle(color, randomUtil.getRandomIndex(LIMIT));
                break;
            case 2:
                figures[i] = new Square(color, randomUtil.getDouble(LIMIT));
                break;
            case 3:
                figures[i] = new RightTriangle(color, randomUtil.getDouble(LIMIT),
                    randomUtil.getDouble(LIMIT));
                break;
            case 4:
                figures[i] = new Rectangle(color, randomUtil.getDouble(LIMIT),
                    randomUtil.getDouble(LIMIT));
                break;
            default:
                figures[i] = getEmptyFigure();
                break;
        }
    }

    private static Figure getEmptyFigure() {
        return new Circle(Color.BLACK, 1);
    }
}
