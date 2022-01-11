package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static Figure getRandomFigure() {
        Random rand = new Random();
        ColorSupplier col = new ColorSupplier();
        switch (rand.nextInt(5) + 1) {
            case 1:
                Square square = new Square();
                square.setSide_a(rand.nextInt(100));
                square.setColor(col.getRandomColor());
                return square;
            case 2:
                Rectangle rectangle = new Rectangle();
                rectangle.setSide_a(rand.nextInt(100));
                rectangle.setSide_b(rand.nextInt(100));
                rectangle.setColor(col.getRandomColor());
                return rectangle;
            case 3:
                Righttriangle righttriangle = new Righttriangle();
                righttriangle.setFirstLeg(rand.nextInt(100));
                righttriangle.setSecondLeg(rand.nextInt(100));
                righttriangle.setColor(col.getRandomColor());
                return righttriangle;
            case 4:
                Circle circle = new Circle();
                circle.setRadius(rand.nextInt(100));
                circle.setColor(col.getRandomColor());
                return circle;
            case 5:
                Isoscelestrapezoid isoscelestrapezoid = new Isoscelestrapezoid();
                isoscelestrapezoid.setUpper_side(rand.nextInt(100));
                isoscelestrapezoid.setLower_side(rand.nextInt(100));
                isoscelestrapezoid.setSide(rand.nextInt(100));
                isoscelestrapezoid.setColor(col.getRandomColor());
                return isoscelestrapezoid;
            default:
                break;
        }

        return null;
    }

    public Figure getDefaultFigure() {
        Circle defaultFigure = new Circle();
        defaultFigure.setRadius(10);
        defaultFigure.setColor("WHITE");
        return defaultFigure;
    }
}
