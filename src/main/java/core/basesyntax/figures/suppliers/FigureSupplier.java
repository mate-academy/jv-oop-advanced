package core.basesyntax.figures.suppliers;

import core.basesyntax.figures.Circle;
import core.basesyntax.figures.Figure;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    public static final int FIGURES_COUNT = 5;

    private Figure figure;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private RoundCalculator roundCalculator = new RoundCalculator();

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(FIGURES_COUNT);
        double[] randomNumber = new double[3];
        String randomColor = colorSupplier.getRandomColor();

        for (int i = 0; i < randomNumber.length; i++) {
            randomNumber[i] = roundCalculator.roundCalc(random.nextDouble(100));
        }

        switch (randomFigure) {
            case 0:
                return getDefaultFigure();
            case 1:
                figure = new IsoscelesTrapezoid(randomNumber[0],
                        randomNumber[1], randomNumber[2], randomColor);
                break;
            case 2:
                figure = new Rectangle(randomNumber[0],randomNumber[1], randomColor);
                break;
            case 3:
                figure = new RightTriangle(randomNumber[0], randomNumber[1], randomColor);
                break;
            case 4:
                figure = new Square(randomNumber[0], randomColor);
                break;
            default:
                System.out.println("Invalid figure number");
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
