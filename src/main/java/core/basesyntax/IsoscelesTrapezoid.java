package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double firstBase;
    private final double secondBase;
    private final double height;

    public IsoscelesTrapezoid(Color color, double firstBase, double secondBase, double height) {
        this.type = "Isosceles Trapezoid";
        this.color = color;
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firstBase + secondBase) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("\n=================\ntype: "
                + this.type
                + "\ncolor: "
                + this.color
                + "\nfirstBase: "
                + this.firstBase
                + "\nsecondBase: "
                + this.secondBase
                + "\nheight: "
                + this.height
                + "\narea: "
                + this.getArea());
    }
}
