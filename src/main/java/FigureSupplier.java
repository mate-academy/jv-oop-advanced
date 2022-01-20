import java.util.Random;

public class FigureSupplier {
    public static final int AMOUNT_OF_FIGURES = 5;
    public static final int BORDER = 5;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(AMOUNT_OF_FIGURES);

        switch (randomNumber) {
            case 0:
                return new Square(new Random().nextInt(BORDER - 1) + 1,
                        new ColorSupplier().getRandomColor());
            case 1:
                return new Rectangle(new Random().nextInt(BORDER - 1) + 1,
                        new Random().nextInt(BORDER - 1) + 1,
                        new ColorSupplier().getRandomColor());
            case 2:
                return new RightTriangle(new Random().nextInt(BORDER - 1) + 1,
                        new Random().nextInt(BORDER - 1) + 1,
                        new ColorSupplier().getRandomColor());
            case 3:
                return new Circle(new Random().nextInt(BORDER - 1) + 1,
                        new ColorSupplier().getRandomColor());
            default:
                return new IsoscelesTrapezoid(new Random().nextInt(BORDER - 1) + 1,
                        new Random().nextInt(BORDER - 1) + 1,
                        new Random().nextInt(BORDER - 1) + 1,
                        new ColorSupplier().getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "WHITE");
    }
}
