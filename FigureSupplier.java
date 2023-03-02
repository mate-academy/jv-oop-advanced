package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private Random random = new Random();
    private Random randomChoice = new Random();
    private ColorSupplier randomColor = new ColorSupplier();
    private Figure[] figures = {new IsoscelesTrapezoid(getRandomNumber(),
            getRandomNumber(), getRandomNumber(), randomColor.getRandomColor()),
            new Circle(getRandomNumber(), randomColor.getRandomColor()),
            new RightTriangle(getRandomNumber(), getRandomNumber(), randomColor.getRandomColor()),
            new Rectangle(getRandomNumber(), getRandomNumber(), randomColor.getRandomColor()),
            new Square(getRandomNumber(), randomColor.getRandomColor())};

    public int getRandomChoice() {
        return randomChoice.nextInt(figures.length);
    }

    public int getRandomNumber() {
        final int MAX_VALUE = 50;
        return random.nextInt(MAX_VALUE);
    }

    public Figure getRandomFigure() {
        return figures[getRandomChoice()];
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }
}
