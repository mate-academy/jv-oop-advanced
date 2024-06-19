package core.basesyntax;

public class FIgureSupplier {
  private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5);
        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                return new Square(color,
                        random.nextDouble() * 10 + 1);
            case 1:
                return new Rectangle(color,
                        random.nextDouble() * 10 + 1,
                        random.nextDouble() * 10 + 1);
            case 2:
                return new Circle(color,
                        random.nextDouble() * 10 + 1);
            case 3:
                return new RightTriangle(color,
                        random.nextDouble() * 10 + 1,
                        random.nextDouble() * 10 + 1);
            case 4:
                return new IsoscelesTrapezoid(color,
                        random.nextDouble() * 10 + 1,
                        random.nextDouble() * 10 + 1,
                        random.nextDouble() * 10 + 1);
            default:
                return getRandomFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
