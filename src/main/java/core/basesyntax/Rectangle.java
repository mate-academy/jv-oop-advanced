package core.basesyntax;

public class Rectangle extends Figure {
    private double smallSide;
    private double bigSide;

    public Rectangle(String color, double smallSide, double bigSide) {
        super(color);
        this.smallSide = smallSide;
        this.bigSide = bigSide;
    }

    @Override
    public double getArea() {
        return smallSide * bigSide;
    }

    @Override
    public String name() {
        return String.valueOf(Figures.RECTANGLE);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name()
                + ", area: " + getArea()
                + ", smallSide: " + smallSide
                + ", bigSide: " + bigSide
                + ", color: " + getColor());
    }
}
