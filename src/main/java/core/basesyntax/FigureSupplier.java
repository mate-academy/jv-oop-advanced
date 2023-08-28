package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier cs = new ColorSupplier();
    private int defaultSizeBound = 100;
    private int numberOfFigureClasses = 5; //How many types of figures are there in program.
    private int defaultRadius = 10;
    private String defaultColor = "WHITE";

    public Figure getDefaultFigure() {
        return new Circle(defaultColor, defaultRadius);
    }

    public Figure getRandomFigure() {
        int whatFigureWillItBe = random.nextInt(numberOfFigureClasses);
        Figure randomFigure;
        switch (whatFigureWillItBe) {
            case 0:
                randomFigure = new Circle(cs.getRandomColor(),
                        random.nextInt(defaultSizeBound));
                break;
            case 1:
                randomFigure = new Square(cs.getRandomColor(),
                        random.nextInt(defaultSizeBound));
                break;
            case 2:
                randomFigure = new Rectangle(cs.getRandomColor(),
                        random.nextInt(defaultSizeBound),
                        random.nextInt(defaultSizeBound));
                break;
            case 3:
                randomFigure = new RightTriangle(cs.getRandomColor(),
                        random.nextInt(defaultSizeBound), random.nextInt(defaultSizeBound));
                break;
            case 4:
                randomFigure = new IsoscelesTrapezoid(cs.getRandomColor(),
                        random.nextInt(defaultSizeBound), random.nextInt(defaultSizeBound),
                        random.nextInt(defaultSizeBound));
                break;
            default:
                randomFigure = getDefaultFigure();
                break;
        }
        return randomFigure;
    }
}
