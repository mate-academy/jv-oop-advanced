package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private ColorSupplier randomColor = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return new Square(random.nextInt(100) + 1,randomColor.getRandomColor());
            case 1:
                return new Rectangle(random.nextInt(100) + 1, random.nextInt(100) + 1,
                        randomColor.getRandomColor());
            case 2:
                return new RightTriangle(random.nextInt(100) + 1,random.nextInt(100) + 1,
                        random.nextInt(100) + 1,
                        randomColor.getRandomColor());
            case 3:
                return new Circle(random.nextInt(100) + 1,
                        randomColor.getRandomColor());
            case 4:
                return new IsoscelesTrapezoid(random.nextInt(100) + 1, random.nextInt(100) + 1,
                        random.nextInt(100) + 1, random.nextInt(100) + 1,
                        randomColor.getRandomColor());
            default:
                return new Circle(20, Color.red);
        }

    }

    public core.basesyntax.Figure getDefaultFigure() {
        return new Circle(10,Color.white);
    }
}
