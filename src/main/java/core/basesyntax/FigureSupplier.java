package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random rand = new Random();
    private ColorSupplier col = new ColorSupplier();

    public Random getRand() {
        return rand;
    }

    public void setRand(Random rand) {
        this.rand = rand;
    }

    public ColorSupplier getCol() {
        return col;
    }

    public void setCol(ColorSupplier col) {
        this.col = col;
    }

    public Square squareIni() {
        Square square = new Square();
        square.setSide_a(rand.nextInt(100));
        square.setColor(col.getRandomColor());
        return square;
    }

    public Rectangle rectangleIni() {
        Rectangle rectangle = new Rectangle();
        rectangle.setSide_a(rand.nextInt(100));
        rectangle.setSide_b(rand.nextInt(100));
        rectangle.setColor(col.getRandomColor());
        return rectangle;
    }

    public Righttriangle righttriangleIni() {
        Righttriangle righttriangle = new Righttriangle();
        righttriangle.setFirstLeg(rand.nextInt(100));
        righttriangle.setSecondLeg(rand.nextInt(100));
        righttriangle.setColor(col.getRandomColor());
        return righttriangle;
    }

    public Circle circleIni() {
        Circle circle = new Circle();
        circle.setRadius(rand.nextInt(100));
        circle.setColor(col.getRandomColor());
        return circle;
    }

    public Isoscelestrapezoid isoscelestrapezoidIni() {
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
                return figure.squareIni();
            case 2:
                return figure.rectangleIni();
            case 3:
                return figure.righttriangleIni();
            case 4:
                return figure.circleIni();
            case 5:
                return figure.isoscelestrapezoidIni();
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
