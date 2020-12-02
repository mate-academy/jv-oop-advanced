package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private double topSide;
    private double bottomSide;
    private double height;
    private String color;

    public IsoscelesTrapezoid(double topSide, double bottomSide, double height, String color) {
        this.topSide = topSide;
        this.bottomSide = bottomSide;
        this.height = height;
        this.color = color;
    }

    public double uniqueMethod() {
        return (this.topSide + this.bottomSide) / 2;
    }

    @Override
    public void draw() {
        System.out.println(getClass().getSimpleName() + ", area : " + getArea()
                + " sq. units, " + "Its' midsection is " + uniqueMethod() + " units , color: "
                + this.color.toLowerCase());
    }

    @Override
    public double getArea() {
        return ((topSide + bottomSide) * height) / 2.0;
    }

    @Override
    public String getColor() {
        return this.color;
    }
}
