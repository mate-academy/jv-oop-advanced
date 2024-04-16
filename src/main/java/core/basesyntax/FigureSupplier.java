package core.basesyntax;

import java.util.Random;

class FigureSupplier {
    private final ColorSupplier colorSupplier;
    private final Random rand = new Random();

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        int figureType = rand.nextInt(5);
        switch (figureType) {
            case 0:
                return new Square(colorSupplier.getRandomColor(),
                        rand.nextDouble() * 10 + 1);
            case 1:
                return new Rectangle(rand.nextDouble() * 10 + 1,
                        rand.nextDouble() * 10 + 1,
                        colorSupplier.getRandomColor());
            case 2:
                return new RightTriangle(rand.nextDouble() * 10 + 1,
                        rand.nextDouble() * 10 + 1,
                        colorSupplier.getRandomColor());
            case 3:
                return new Circle(colorSupplier.getRandomColor(),
                        rand.nextDouble() * 10 + 1);
            case 4:
                return new IsoscelesTrapezoid(rand.nextDouble() * 10 + 1,
                        rand.nextDouble() * 10 + 1,
                        rand.nextDouble() * 10 + 1,
                        colorSupplier.getRandomColor()) {
                    @Override
                    public Color getColor() {
                        return null;
                    }
                };

            default:
                throw new IllegalArgumentException("Invalid figure type");
        }
    }
}
