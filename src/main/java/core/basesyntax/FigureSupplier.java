package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_COUNT = 5;
    private static final String COLOR_DEFAULT = "WHITE";
    private static final int RADIUS_DEFAULT = 10;
    private Random random = new Random();
    private String randomColor;

    public Figure getRandomFigure() {
        Figure figure;
        int figureNumber = random.nextInt(FIGURES_COUNT);
        switch (figureNumber) {
            case 1:
                randomColor = new ColorSupplier().getRandomColor();
                double randomRadius = random.nextInt(50);
                figure = new Circle(randomColor, randomRadius);
                break;
            case 2:
                randomColor = new ColorSupplier().getRandomColor();
                double randomSide = random.nextInt(50);
                figure = new Square(randomColor, randomSide);
                break;
            case 3:
                randomColor = new ColorSupplier().getRandomColor();
                double randomFirstLeg = random.nextInt(50);
                double randomSecondLeg = random.nextInt(50);
                figure = new RightTriangle(randomColor, randomFirstLeg, randomSecondLeg);
                break;
            case 4:
                randomColor = new ColorSupplier().getRandomColor();
                double randomFirstSide = random.nextInt(50);
                double randomSecondSide = random.nextInt(50);
                figure = new Rectangle(randomColor, randomFirstSide, randomSecondSide);
                break;
            default:
                randomColor = new ColorSupplier().getRandomColor();
                double randomFirstSideTr = random.nextInt(50);
                double randomSecondSideTr = random.nextInt(50);
                double randomHeight = random.nextInt(50);
                figure = new IsoscelesTrapezoid(randomColor, randomFirstSideTr,
                        randomSecondSideTr, randomHeight);
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(COLOR_DEFAULT, RADIUS_DEFAULT);
    }
}
