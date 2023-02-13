package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator {
    private double side;
    private double topBase;
    private double bottomBase;

    public IsoscelesTrapezoid() {
        super();
        setName(FigureType.ISOSCELESTRAPEZOID);
        this.side = 1;
        this.topBase = 1;
        this.bottomBase = 1;
    }

    public IsoscelesTrapezoid(FigureType name, String color, double side,
                               double topBase, double bottomBase) {
        super(name, color);
        setSide(side);
        setTopBase(topBase);
        setBottomBase(bottomBase);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = (side >= 0) ? side : 0;
    }

    public double getTopBase() {
        return topBase;
    }

    public void setTopBase(double topBase) {
        this.topBase = (topBase >= 0) ? topBase : 0;
    }

    public double getBottomBase() {
        return bottomBase;
    }

    public void setBottomBase(double bottomBase) {
        this.bottomBase = (bottomBase >= 0) ? bottomBase : 0;
    }

    @Override
    public double getArea() {
        return (bottomBase + topBase) / 2 * Math.sqrt(Math.pow(side, 2)
                - (Math.pow((side - topBase), 2) / 4));
    }

    @Override
    public String toDraw() {
        StringBuilder builder = new StringBuilder();
        return builder.append(super.toDraw()).append(", side: ").append(side)
                .append(", top base: ").append(topBase).append(", bottom base: ")
                .append(bottomBase).append(", area: ").append(getArea()).toString();
    }
}
