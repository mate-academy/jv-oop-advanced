package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final String name = "Isosceles Trapezoid";
    private int bottomSide;
    private int topSide;
    private int heigth;

    public IsoscelesTrapezoid(Colors color, int bottomSide, int topSide, int heigth) {
        super(color);
        this.bottomSide = bottomSide;
        this.topSide = topSide;
        this.heigth = heigth;
    }

    public String getName() {
        return name;
    }

    public double getBottomSide() {
        return bottomSide;
    }

    public double getTopSide() {
        return topSide;
    }

    public double getHeigth() {
        return heigth;
    }

    @Override
    public double getArea() {
        return (getBottomSide() + getTopSide()) / 2 * getHeigth();
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getArea() + " sq. units, heigth: " + getHeigth()
                + " units, color: " + getColor());
    }

}
