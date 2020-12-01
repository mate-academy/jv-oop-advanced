package core.basesyntax;

public class IsoscelesTrapezoid extends Figures implements Drawable{
    private int trapHeight;

    public IsoscelesTrapezoid(Colors color, int area, int trapHeight) {
        super(color, area);
        this.trapHeight = trapHeight;
    }

    public int getTrapHeight() {
        return trapHeight;
    }

    @Override
    public void draw() {
        System.out.println("Isosceles Trapezoid has been drawn");
    }
    @Override
    public String toString() {
        return "Shape: isosceles trapezoid, area: "
                + getArea() + " sq. units, height: "
                + getTrapHeight() + " units, color: " + getColor().toLowerCase();
    }
}


//trapezoid height