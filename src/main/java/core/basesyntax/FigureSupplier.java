package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANDOM_INT_LIMIT = 100;
    private static final int TRAPEZOID_SMALLER_INT_LIMIT = 80;
    private static final int FIGURES_NUMBER = 5;
    private static final int LEG_COEFFICIENT = 3;
    private static final int BASE_COEFFICIENT = 4;
    private static final int HYPOTENUSE_COEFFICIENT = 5;

    private final RandomColorGenerator randomColorGenerator;

    public FigureSupplier(RandomColorGenerator randomColorGenerator) {
        this.randomColorGenerator = randomColorGenerator;
    }

    public Figure[] generateFigures() {
        Figure[] figures = new Figure[new Random().nextInt(RANDOM_INT_LIMIT)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = generateRandomFigure();
        }
        return figures;
    }

    private Figure generateRandomFigure() {
        Random index = new Random();
        Figure figure = null;
        switch (index.nextInt(FIGURES_NUMBER)) {
            case 0:
                figure = generateCircle();
                break;
            case 1:
                figure = generateSquare();
                break;
            case 2:
                figure = generateTriangle();
                break;
            case 3:
                figure = generateRectangle();
                break;
            case 4:
                figure = generateTrapezoid();
                break;
            default:
                break;
        }
        return figure;
    }

    private Figure generateTrapezoid() {
        Random random = new Random();
        int a = random.nextInt(RANDOM_INT_LIMIT);
        int b = random.nextInt(TRAPEZOID_SMALLER_INT_LIMIT);
        int oppositeToB = random.nextInt(RANDOM_INT_LIMIT);
        while (oppositeToB < b) {
            b = random.nextInt(RANDOM_INT_LIMIT);
        }
        int height = 2 * a * (b + oppositeToB);
        return new Trapezoid(randomColorGenerator.generateColor(), b, oppositeToB, height);
    }

    private Figure generateRectangle() {
        int sideOne = new Random().nextInt(RANDOM_INT_LIMIT);
        int sideTwo = new Random().nextInt(RANDOM_INT_LIMIT);
        while (sideTwo == sideOne) {
            sideTwo = new Random().nextInt(RANDOM_INT_LIMIT);
        }
        return new Rectangle(randomColorGenerator.generateColor(), sideOne, sideTwo);
    }

    private Figure generateTriangle() {
        int coefficient = new Random().nextInt(RANDOM_INT_LIMIT);
        return new Triangle(randomColorGenerator.generateColor(),
                coefficient * LEG_COEFFICIENT,
                coefficient * BASE_COEFFICIENT,
                coefficient * HYPOTENUSE_COEFFICIENT);
    }

    private Figure generateSquare() {
        return new Square(randomColorGenerator.generateColor(),
                new Random().nextInt(RANDOM_INT_LIMIT));
    }

    private Figure generateCircle() {
        return new Circle(randomColorGenerator.generateColor(),
                new Random().nextInt(RANDOM_INT_LIMIT));
    }
}

