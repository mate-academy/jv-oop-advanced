package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    Random rand = new Random();
    ColorSupplier col = new ColorSupplier();
    public Square SquareIni() {
        Square square = new Square();
        square.setSide_a(rand.nextInt(100));
        square.setColor(col.getRandomColor());
        return square;
    }

    public Rectangle RectangleIni() {
        Rectangle rectangle = new Rectangle();
        rectangle.setSide_a(rand.nextInt(100));
        rectangle.setSide_b(rand.nextInt(100));
        rectangle.setColor(col.getRandomColor());
        return rectangle;
    }

    public Righttriangle RighttriangleIni() {
        Righttriangle righttriangle = new Righttriangle();
        righttriangle.setFirstLeg(rand.nextInt(100));
        righttriangle.setSecondLeg(rand.nextInt(100));
        righttriangle.setColor(col.getRandomColor());
        return righttriangle;
    }

    public Circle CircleIni() {
        Circle circle = new Circle();
        circle.setRadius(rand.nextInt(100));
        circle.setColor(col.getRandomColor());
        return circle;
    }

    public Isoscelestrapezoid IsoscelestrapezoidIni() {
        Isoscelestrapezoid isoscelestrapezoid = new Isoscelestrapezoid();
        isoscelestrapezoid.setUpper_side(rand.nextInt(100));
        isoscelestrapezoid.setLower_side(rand.nextInt(100));
        isoscelestrapezoid.setSide(rand.nextInt(100));
        isoscelestrapezoid.setColor(col.getRandomColor());
        return isoscelestrapezoid;
    }
    public static Figure getRandomFigure() {
        Random rand = new Random();
        FigureSupplier figure = new FigureSupplier();
        int figuresQuantity = 5;
        switch (rand.nextInt(figuresQuantity) + 1) {
            case 1:
                return figure.SquareIni();
            case 2:
                return figure.RectangleIni();
            case 3:
                return figure.RighttriangleIni();
            case 4:
                return figure.CircleIni();
            case 5:
                return figure.IsoscelestrapezoidIni();
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
