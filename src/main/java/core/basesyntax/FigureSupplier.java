package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private ColorSupplier color = new ColorSupplier();
    private Circle whiteCircle = new Circle("white", 10);

    public Figure getRandomFigure() {
        int i = random.nextInt(FIGURE_COUNT);
        String randomColor = color.getRandomColor();
        Figure randomFigure;
        switch (i) {
            case 1: randomFigure = new Circle(randomColor, random.nextInt(50));
            break;
            case 2: randomFigure = new IsoscelesTrapezoid(randomColor, random.nextInt(50),
                    random.nextInt(50), random.nextInt(50));
            break;
            case 3: randomFigure = new RightTriangle(randomColor, random.nextInt(50),
                    random.nextInt(50));
            break;
            case 4: randomFigure = new Rectangle(randomColor, random.nextInt(50),
                    random.nextInt(50));
            break;
            default: randomFigure = new Square(randomColor, random.nextInt(50));

        }
        return randomFigure;
    }

    public Figure getDefaultFigure() {
        return whiteCircle;
    }
}
