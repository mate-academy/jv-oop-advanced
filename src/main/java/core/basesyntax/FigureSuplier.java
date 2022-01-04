package core.basesyntax;

import java.util.Random;

public class FigureSuplier {
    private static final int boundRandom = 10;
    private static final int DEFAULT_RADIUS = 10;
    private static final int RANDOM_RANGE = 6;
    private Random random = new Random();
    private ColorSuplier colorSuplier = new ColorSuplier();

    public Figure getRandomFigure() {
        int indexShapeFigure = random.nextInt(RANDOM_RANGE);
        Figure figure;
        switch (indexShapeFigure) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomCircle();
            case 4:
                return getRandomIsoscelesTrapezoid();
            case 5:
                return getRandomRhombus();
            default:
                return getDafaultFigure();
        }
    }

    public Circle getRandomCircle() {
        return new Circle(new Random().nextInt(boundRandom) + 1, colorSuplier.getRondomColor());
    }

    public Square getRandomSquare() {
        return new Square(new Random().nextInt(boundRandom) + 1, colorSuplier.getRondomColor());
    }

    public RightTriangle getRandomRightTriangle() {
        return new RightTriangle(new Random().nextInt(boundRandom) + 1,
                new Random().nextInt(boundRandom) + 1, colorSuplier.getRondomColor());
    }

    public Rhombus getRandomRhombus() {
        return new Rhombus(new Random().nextInt(89) + 1,
                new Random().nextInt(boundRandom) + 1, colorSuplier.getRondomColor());
    }

    public Rectangle getRandomRectangle() {
        return new Rectangle(new Random().nextInt(boundRandom) + 1,
                new Random().nextInt(boundRandom) + 1, colorSuplier.getRondomColor());

    }

    public IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(new Random().nextInt(boundRandom) + 1,
                new Random().nextInt(boundRandom) + 1, new Random().nextInt(boundRandom) + 1,
                colorSuplier.getRondomColor());

    }

    public Figure getDafaultFigure() {
        return new Circle(this.DEFAULT_RADIUS, Color.WHITE.toString());
    }
}
