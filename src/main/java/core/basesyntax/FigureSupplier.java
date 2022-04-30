package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    final int FIGURE_TYPES = 5;
    final int MAX_RANDOM_SIDE_LENGTH = 5;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(FIGURE_TYPES);
        int a = new Random().nextInt(MAX_RANDOM_SIDE_LENGTH) + 1;
        int b = new Random().nextInt(MAX_RANDOM_SIDE_LENGTH) + 1;
        int c = new Random().nextInt(MAX_RANDOM_SIDE_LENGTH) + 1;
        ColorSupplier randomColor = new ColorSupplier();
        String color = randomColor.getRandomColor();
        switch (randomFigure) {
            case (0):
                Figure sq = new Square(a, color);
                return sq;
            case (1):
                Figure re = new Rectangle(a, b, color);
                return re;
            case (2):
                Figure rt = new RightTriangle(a, b, color);
                return rt;
            case (3):
                Figure cr = new Circle(a, color);
                return cr;
            default:
                Figure it = new IsoscelesTrapezoid(a, b, c, color);
                return it;
        }

    }
    
    public Figure getDefaultFigure() {
        Figure defaultFigure = new Square(10, "WHITE");
        return defaultFigure;
    }
}
