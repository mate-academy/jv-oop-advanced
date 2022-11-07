package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        Figure randomFigure = null;
        ColorSupplier colorSupplier = new ColorSupplier();
        switch (figureNumber) {
            case 0:
                randomFigure = new Circle(colorSupplier.getRandomColor(), random.nextInt());
                break;
            case 1:
                randomFigure = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(), random.nextInt(), random.nextInt());
                break;
            case 2:
                randomFigure = new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(), random.nextInt());
                break;
            case 3:
                randomFigure = new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(), random.nextInt());
                break;
            case 4:
                randomFigure = new Square(colorSupplier.getRandomColor(), random.nextInt());
                break;
            default:
                System.out.println("Wrong command. Try again");
                break;
        }
        return randomFigure;
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
