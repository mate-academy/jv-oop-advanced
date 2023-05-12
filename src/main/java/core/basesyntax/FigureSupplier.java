package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier cs = new ColorSupplier();
    private int maximalSize = 100;
    private int numberOfFigureClasses = 5;
    public Figure getDefaultFigure () {
        return new Circle();
    }
    public Figure getRandomFigure () {
        int whatFigureWillItBe = random.nextInt(numberOfFigureClasses);
        Figure randomFigure;
        switch (whatFigureWillItBe) {
            case 0:
                randomFigure = new Circle(cs.getRandomColor(), random.nextInt(maximalSize));
                break;
            case 1:
                randomFigure = new Square(cs.getRandomColor(), random.nextInt(maximalSize));
                break;
            case 2:
                randomFigure = new Rectangle(cs.getRandomColor(),
                        random.nextInt(maximalSize), random.nextInt(maximalSize));
                break;
            case 3:
                randomFigure = new RightTriangle(cs.getRandomColor(), random.nextInt(maximalSize));
                break;
            case 4:
                randomFigure = new IsoscelesTrapezoid(cs.getRandomColor(),
                        random.nextInt(maximalSize), random.nextInt(maximalSize), random.nextInt(maximalSize));
                break;
            default:
                randomFigure = getDefaultFigure();
                break;
        }
        return randomFigure;
    }
    public Figure getRandomDefaultFigure () {
        int whatFigureWillItBe = random.nextInt(numberOfFigureClasses);
        Figure randomFigure;
        switch (whatFigureWillItBe) {
            case 0:
                randomFigure = new Circle();
                break;
            case 1:
                randomFigure = new Square();
                break;
            case 2:
                randomFigure = new Rectangle();
                break;
            case 3:
                randomFigure = new RightTriangle();
                break;
            case 4:
                randomFigure = new IsoscelesTrapezoid();
                break;
            default:
                randomFigure = getDefaultFigure();
                break;
        }
        return randomFigure;
    }
}
