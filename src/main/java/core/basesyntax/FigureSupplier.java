package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_LENGTH = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE);
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(6);
        switch (index) {
            case 0:
                return new Circle(makeRandomTo11(), colorSupplier.getRandomColor());
            case 1:
                return new Square(makeRandomTo11(), colorSupplier.getRandomColor());
            case 2:
                return new RightTriangle(makeRandomTo11(), makeRandomTo11(),
                        colorSupplier.getRandomColor());
            case 3:
                return new Rectangle(makeRandomTo11(), makeRandomTo11(),
                        colorSupplier.getRandomColor());
            case 4:
                return new IsoscelesTrapezoid(makeRandomTo11(), makeRandomTo11(),
                        makeRandomTo11(), colorSupplier.getRandomColor());
            default:
                return getDefaultFigure();
        }
    }

    private int makeRandomTo11() {
        return random.nextInt(MAX_LENGTH) + 1;
    }
}
