package core.basesyntax;

public class RightTriangle extends Figure {
    private int height;
    private int base;

    public RightTriangle(String color, int height, int base) {
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    public double getArea() {
        return (height * base) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rightTriangle; "
                + "area: " + getArea() + " sq.units"
                + "; height: " + height
                + "; base: " + base
                + "; colour: " + this.getColor()
                + ';');
    }
}
