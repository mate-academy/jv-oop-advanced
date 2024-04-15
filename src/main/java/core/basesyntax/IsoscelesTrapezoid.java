package core.basesyntax;

import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    private static final int MAX_NUMBER = 100;
    private int side;
    private int topBase;
    private int lowBase;
    private int height;
    private final Random random = new Random();
    private final ColorSupplier color = new ColorSupplier();

    public IsoscelesTrapezoid(String color, int side, int topBase, int lowBase, int height) {
        super(color);
        this.side = side;
        this.topBase = topBase;
        this.lowBase = lowBase;
        this.height = height;
    }

    public IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        int side = random.nextInt(MAX_NUMBER);
        int topBase = random.nextInt(MAX_NUMBER);
        int lowBase = random.nextInt(MAX_NUMBER);
        int height = random.nextInt(MAX_NUMBER);
        return new IsoscelesTrapezoid(color.getRandomColor(), side, topBase, lowBase, height);
    }

    public double getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public double getTopBase() {
        return topBase;
    }

    public void setTopBase(int topBase) {
        this.topBase = topBase;
    }

    public double getLowBase() {
        return lowBase;
    }

    public void setLowBase(int lowBase) {
        this.lowBase = lowBase;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("IsoscelesTrapezoid = {" + "color: " + getColor()
                + ", top base: " + getTopBase() + ", low base: " + getLowBase()
                + ", side: " + getSide() + ", height: " + getHeight()
                + ", area: " + getArea() + "}");
    }

    @Override
    public double getArea() {
        return (double) ((topBase + lowBase) / 2) * height;
    }
}
