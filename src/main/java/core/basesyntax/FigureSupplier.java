package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES = 5;

    public Object getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Random random = new Random();
        double generatedDouble = Math.ceil(Math.random() * 10);
        int limit = (int) Math.ceil(Math.random() * FIGURES);
        int target = random.nextInt(FIGURES);
        switch (target) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), generatedDouble);
            case 1:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        generatedDouble, generatedDouble);
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        generatedDouble, generatedDouble);
            case 3:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), generatedDouble,
                        generatedDouble, generatedDouble);
            case 4:
            default:
                return new Cirlce(colorSupplier.getRandomColor(), generatedDouble);

        }
    }
}
