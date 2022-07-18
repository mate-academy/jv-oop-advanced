package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_COUNT = 5;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private String randomColor;
    private Figure figure;

    private Circle getRandomCircle() {
        randomColor = new ColorSupplier().getRandomColor();
        double randomRadius = random.nextInt(50);
        return new Circle(randomColor, randomRadius);
    }

    private Square getRandomSquare() {
        randomColor = new ColorSupplier().getRandomColor();
        double randomSide = random.nextInt(50);
        return new Square(randomColor, randomSide);
    }

    private RightTriangle getRandomRightTriangle() {
        randomColor = new ColorSupplier().getRandomColor();
        double randomFirstLeg = random.nextInt(50);
        double randomSecondLeg = random.nextInt(50);
        return new RightTriangle(randomColor, randomFirstLeg, randomSecondLeg);
    }

    private Rectangle getRectangle() {
        randomColor = new ColorSupplier().getRandomColor();
        double randomFirstSide = random.nextInt(50);
        double randomSecondSide = random.nextInt(50);
        return new Rectangle(randomColor, randomFirstSide, randomSecondSide);
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid() {
        randomColor = new ColorSupplier().getRandomColor();
        double randomFirstSideTr = random.nextInt(50);
        double randomSecondSideTr = random.nextInt(50);
        double randomHeight = random.nextInt(50);
        return new IsoscelesTrapezoid(randomColor, randomFirstSideTr,
                randomSecondSideTr, randomHeight);
    }

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
        return new Circle(DEFAULT_COLOR, RADIUS_DEFAULT);
    }
}
