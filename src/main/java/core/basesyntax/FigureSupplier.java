package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_QUANTITY = 5;
    private Random random = new Random();
    private ColorSupplier color = new ColorSupplier();

    public Figure getRandomFigure() {
        Random rand = new Random();
        switch (rand.nextInt(FIGURES_QUANTITY)) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomCircle();
            case 4:
                return getRandomTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        Circle defaultFigure = new Circle();
        defaultFigure.setRadius(10);
        defaultFigure.setColor("WHITE");
        return defaultFigure;
    }

    private Square getRandomSquare() {
        Square square = new Square();
        square.setSide_a(random.nextInt(100));
        square.setColor(color.getRandomColor());
        return square;
    }

    private Rectangle getRandomRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setSide_a(random.nextInt(100));
        rectangle.setSide_b(random.nextInt(100));
        rectangle.setColor(color.getRandomColor());
        return rectangle;
    }

    private Righttriangle getRandomRightTriangle() {
        Righttriangle righttriangle = new Righttriangle();
        righttriangle.setFirstLeg(random.nextInt(100));
        righttriangle.setSecondLeg(random.nextInt(100));
        righttriangle.setColor(color.getRandomColor());
        return righttriangle;
    }

    private Circle getRandomCircle() {
        Circle circle = new Circle();
        circle.setRadius(random.nextInt(100));
        circle.setColor(color.getRandomColor());
        return circle;
    }

    private Isoscelestrapezoid getRandomTrapezoid() {
        Isoscelestrapezoid isoscelestrapezoid = new Isoscelestrapezoid();
        isoscelestrapezoid.setUpper_side(random.nextInt(100));
        isoscelestrapezoid.setLower_side(random.nextInt(100));
        isoscelestrapezoid.setSide(random.nextInt(100));
        isoscelestrapezoid.setColor(color.getRandomColor());
        return isoscelestrapezoid;
    }
}
