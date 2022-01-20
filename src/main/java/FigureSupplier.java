import java.util.Random;

public class FigureSupplier {
    public static final int AMOUNT_OF_FIGURES = 5;
    public static final int BORDER = 5;
    private Random random = new Random();

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(AMOUNT_OF_FIGURES);
        int randomNumber1 = random.nextInt(BORDER - 1) + 1;
        int randomNumber2 = random.nextInt(BORDER - 1) + 1;
        int randomNumber3 = random.nextInt(BORDER - 1) + 1;

        switch (randomFigure) {
            case 0:
                return new Square(randomNumber1,
                        new ColorSupplier().getRandomColor());
            case 1:
                return new Rectangle(randomNumber1, randomNumber2,
                        new ColorSupplier().getRandomColor());
            case 2:
                return new RightTriangle(randomNumber1, randomNumber2,
                        new ColorSupplier().getRandomColor());
            case 3:
                return new Circle(randomNumber1,
                        new ColorSupplier().getRandomColor());
            default:
                return new IsoscelesTrapezoid(randomNumber1, randomNumber2, randomNumber3,
                        new ColorSupplier().getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "WHITE");
    }
}
