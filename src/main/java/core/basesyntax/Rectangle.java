package core.basesyntax;

public class Rectangle extends Figure {
    private double longSide;
    private double shortSide;

    public Rectangle(String color, double longSide, double shortSide) {
        super(color);
        this.longSide = longSide;
        this.shortSide = shortSide;
    }

    @Override
    public double getArea() {
        return longSide * shortSide;
    }

    @Override
    public void draw() {
        String rectangleInfo = "Figure: "
                + this.getClass().getSimpleName()
                + ", area: "
                + getArea()
                + " sq.units, long side: "
                + longSide
                + " units, short side: "
                + shortSide
                + " units, color: "
                + getColor();
        System.out.println(rectangleInfo);
    }
}
