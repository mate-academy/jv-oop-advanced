package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double side;
    private double topBase;
    private double bottomBase;

    public IsoscelesTrapezoid(String color, double side,
                               double topBase, double bottomBase) {
        super(FigureType.ISOSCELESTRAPEZOID, color);
        this.side = side;
        this.topBase = topBase;
        this.bottomBase = bottomBase;
    }

    @Override
    public double getArea() {
        return (bottomBase + topBase) / 2 * Math.sqrt(Math.pow(side, 2)
                - (Math.pow((side - topBase), 2) / 4));
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        System.out.println(builder.append("Figure: ").append(getName())
                .append(", color: ").append(getColor()).append(", side: ").append(side)
                .append(", top base: ").append(topBase).append(", bottom base: ")
                .append(bottomBase).append(", area: ").append(getArea()).toString());
    }
}
