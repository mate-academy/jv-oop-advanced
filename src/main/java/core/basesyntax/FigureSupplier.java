package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_NUMBER = 50;
    private static final int FIGURES_COUNT = 5;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private String randomColor;
    private Figure figure;

    public Figure getRandomFigure() {
        FigureSupplier figureSupplier = new FigureSupplier();
        int randomIndex = random.nextInt(FIGURES_COUNT);
        switch (randomIndex) {
            case 0:
                figure = figureSupplier.getRandomCircle();
                break;
            case 1:
                figure = figureSupplier.getRandomSquare();
                break;
            case 2:
                figure = figureSupplier.getRandomRightTriangle();
                break;
            case 3:
                figure = figureSupplier.getRectangle();
                break;
            case 4:
                figure = figureSupplier.getIsoscelesTrapezoid();
                break;
            default:
                figure = figureSupplier.getIsoscelesTrapezoid();
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Circle getRandomCircle() {
        randomColor = new ColorSupplier().getRandomColor();
        double randomRadius = random.nextInt(MAX_RANDOM_NUMBER);
        return new Circle(randomColor, randomRadius);
    }

    private Square getRandomSquare() {
        randomColor = new ColorSupplier().getRandomColor();
        double randomSide = random.nextInt(MAX_RANDOM_NUMBER);
        return new Square(randomColor, randomSide);
    }

    private RightTriangle getRandomRightTriangle() {
        randomColor = new ColorSupplier().getRandomColor();
        double randomFirstLeg = random.nextInt(MAX_RANDOM_NUMBER);
        double randomSecondLeg = random.nextInt(MAX_RANDOM_NUMBER);
        return new RightTriangle(randomColor, randomFirstLeg, randomSecondLeg);
    }

    private Rectangle getRectangle() {
        randomColor = new ColorSupplier().getRandomColor();
        double randomFirstSide = random.nextInt(MAX_RANDOM_NUMBER);
        double randomSecondSide = random.nextInt(MAX_RANDOM_NUMBER);
        return new Rectangle(randomColor, randomFirstSide, randomSecondSide);
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid() {
        randomColor = new ColorSupplier().getRandomColor();
        double randomFirstSideTr = random.nextInt(MAX_RANDOM_NUMBER);
        double randomSecondSideTr = random.nextInt(MAX_RANDOM_NUMBER);
        double randomHeight = random.nextInt(MAX_RANDOM_NUMBER);
        return new IsoscelesTrapezoid(randomColor, randomFirstSideTr,
                randomSecondSideTr, randomHeight);
    }
}
