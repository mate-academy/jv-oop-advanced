package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure figure = generateFigure();
        figure.setColor(colorSupplier.getRandomColor());
        return figure;
    }

    public Figure getDefaultFigure() {
        Figure figure = new Circle(10);
        figure.setColor(Color.white);
        return figure;
    }
    private Figure generateFigure() {
        int figure1 = random.nextInt(5);
        switch (figure1) {
            case 0:
                return new Square(random.nextInt(500));
            case 1:
                return new Rectangle(random.nextInt(500), random.nextInt(500));
            case 2:
                return new RightTriangle(random.nextInt(500), random.nextInt(500));
            case 3:
                return new Circle(random.nextInt(500));
            case 4:
            default:
                return new IsoscelesTrapezoid(random.nextInt(500), random.nextInt(500), random.nextInt(500));
        }
    }
}
