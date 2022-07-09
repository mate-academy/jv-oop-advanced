package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final int defaultRadius = 5;
    private final int maxNumber = 30;
    private final int amountFigure = 5;
    private Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figures getRandomFigure() {
        switch (random.nextInt(amountFigure)) {
            case 1:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(maxNumber));
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(maxNumber),
                        random.nextInt(maxNumber));
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(maxNumber),
                        random.nextInt(maxNumber));
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(maxNumber),
                        random.nextInt(maxNumber),
                        random.nextInt(maxNumber));
            default:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(maxNumber));

        }
    }

    public Figures getDefaultFigure() {
        return new Circle(Color.WHITE.toString(), defaultRadius);
    }
}

