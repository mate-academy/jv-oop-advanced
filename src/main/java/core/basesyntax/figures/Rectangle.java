package core.basesyntax.figures;

public class Rectangle extends Figure {
    private final int smallerSide;
    private final int biggerSide;

    public Rectangle(String color, int smallerSide, int biggerSide) {
        super(color);
        this.smallerSide = smallerSide;
        this.biggerSide = biggerSide;
    }

    public int getSmallerSide() {
        return smallerSide;
    }

    public int getBiggerSide() {
        return biggerSide;
    }

    @Override
    public double getArea() {
        return smallerSide * biggerSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, "
                + "area: " + getArea()
                + ", bigger side: " + getBiggerSide()
                + ", smaller side: " + getSmallerSide()
                + ", color: " + getColor());
    }
}
