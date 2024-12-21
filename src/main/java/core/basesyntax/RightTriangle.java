package core.basesyntax;

public class RightTriangle extends Figure {

    private int height;
    private int base;

    public RightTriangle (String color, int height, int base) {
        super (color);
        this.height = height;
        this.base = base;
        setArea (height*base/2.0);
    }

    @Override
    public void draw () {
        System.out.println ("Figure: " + getName() + ", area: " + getArea() + " sq. units, height: "
                + height + " units, base: " + base + " units, color: " + getColor());
    }
}
