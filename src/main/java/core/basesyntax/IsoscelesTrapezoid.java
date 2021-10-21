package core.basesyntax;

public class IsoscelesTrapezoid extends Shape {
    private int bottomBase;
    private int upperBase;
    private int edge;

    public IsoscelesTrapezoid(int bottomBase, int upperBase, int edge, String color) {
        super(color);
        this.bottomBase = bottomBase;
        this.upperBase = upperBase;
        this.edge = edge;
    }

    @Override
    public float countArea() {
        //Brahmagupta formula
        float p = upperBase + bottomBase + 2 * edge;
        return (float) (Math.sqrt((p - upperBase) * (p - bottomBase) * (p - edge) * (p - edge)));
    }

    @Override
    public void draw() {
        System.out.printf("IsoscelesTrapezoid, area: "
                        + "%.2f sq.units bottomBase: %d units, "
                        + "upperBase: %d units, edge: %d units, color: " + getColor() + "\n",
                         countArea(), bottomBase, upperBase, edge);
    }
}
