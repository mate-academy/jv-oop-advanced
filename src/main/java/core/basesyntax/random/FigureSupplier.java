package core.basesyntax.random;

import core.basesyntax.Color;
import core.basesyntax.Figure;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public int getRandomNumber(int number) {
        return (random.nextInt(number) + 1);
    }

    public Figure getRandomFigure() {
        int figureNumber = getRandomNumber(FIGURE_COUNT);
        Figure figure;
        switch (figureNumber) {
            case 0:
                figure = new Square(getRandomNumber(10));
                figure.setName("square");
                figure.setColor(colorSupplier.getRandomColor());
                break;
            case 1:
                figure = new Rectangle(getRandomNumber(10), getRandomNumber(10));
                figure.setName("rectangle");
                figure.setColor(colorSupplier.getRandomColor());
                break;
            case 2:
                figure = new RightTriangle(getRandomNumber(10), getRandomNumber(10));
                figure.setName("right triangle");
                figure.setColor(colorSupplier.getRandomColor());
                break;
            case 3:
                figure = new Circle(getRandomNumber(10));
                figure.setName("circle");
                figure.setColor(colorSupplier.getRandomColor());
                break;
            default:
                figure = new IsoscelesTrapezoid(getRandomNumber(10), getRandomNumber(10),
                        getRandomNumber(10));
                figure.setName("isosceles trapezoid");
                figure.setColor(colorSupplier.getRandomColor());
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        Figure figure;
        figure = new Circle(10);
        figure.setName("circle");
        figure.setColor(Color.WHITE.name().toLowerCase());
        return figure;
    }

}

