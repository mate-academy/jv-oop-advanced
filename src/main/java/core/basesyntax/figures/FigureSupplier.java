package core.basesyntax.figures;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {

        Figure figure;

        int figureInt = random.nextInt(5);
        switch (figureInt) {
            case 0:
                figure = new Circle(random.nextInt(30), colorSupplier.getRandomColor());
                break;
            case 1:
                figure = new Square(random.nextInt(30), colorSupplier.getRandomColor());
                break;
            case 2:
                figure = new IsoscelesTrapezoid(random.nextInt(30), random.nextInt(30),
                        random.nextInt(30), colorSupplier.getRandomColor());
                break;
            case 3:
                figure = new RightTriangle(random.nextInt(30),
                        random.nextInt(30), colorSupplier.getRandomColor());
                break;
            case 4:
                figure = new Rectangle(random.nextInt(30),
                        random.nextInt(30), colorSupplier.getRandomColor());
                break;
            default:
                figure = new Circle(DEFAULT_RADIUS, Color.White.toString());
                break;

        }

        return figure;
    }

    public Figure getDefaultFigure() {

        return new Circle(DEFAULT_RADIUS, Color.White.toString());
    }
}
