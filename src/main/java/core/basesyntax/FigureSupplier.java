package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private String randomColor;

    public Figure getRandomFigure() {
        Figure figure;
        int figureNumber = random.nextInt(FIGURE_COUNT);
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
                figure = new IsoscelesTrapezoid(randomColor, randomFirstSideTr, randomSecondSideTr, randomHeight);
                break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
