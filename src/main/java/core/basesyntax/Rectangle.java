package core.basesyntax;

public class Rectangle extends Figure {
    private float height;
    private float wigth;

    public Rectangle(String color, float height, float wigth) {
        super(color);
        this.height = height;
        this.wigth = wigth;
    }

    @Override
    public float getArea() {
        return height * wigth;
    }

    @Override
    public void draw() {
        System.out.println("Figure: resctangle, area: " + getArea()
                + " sq.units, height: " + height
                + " sq.units, wigth: " + wigth
                + " units, color: " + getColor());
    }
}
