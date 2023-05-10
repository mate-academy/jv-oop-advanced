package core.basesyntax;

public class Rectangle extends Figure {
    private int height;
    private int weight;

    public Rectangle(String color, int height, int weight) {
        super(color);
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Figure: rectangle; "
                + "area: " + getArea() + " sq.units"
                + "; height: " + height
                + "; weight: " + weight
                + "; colour: " + this.getColor()
                + ';';
    }

    @Override
    public double getArea() {
        return height * weight;
    }

    @Override
    public void draw() {
        System.out.println("area: " + getArea() + " sq.units");
    }
}
