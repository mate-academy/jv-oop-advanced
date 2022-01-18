import java.util.Random;

public class FigureSupplier {
    public static final int AMOUNT_OF_FIGURES = 2;
    public static final int BORDER = 5;

    public Figure getRandomFigure() {
        int randomNumber = new Random().nextInt(AMOUNT_OF_FIGURES) + 1;
        if (randomNumber == 1) {
            return new Square(new Random().nextInt(BORDER - 1) + 1,
                    new ColorSupplier().getRandomColor());
        }
        if (randomNumber == 2) {
            return new Circle(new Random().nextInt(BORDER - 1) + 1,
                    new ColorSupplier().getRandomColor());
        }
        return null;
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "WHITE");
    }
}
