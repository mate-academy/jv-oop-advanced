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
    public double countArea() {
        //Brahmagupta formula
        int p = upperBase + bottomBase + 2 * edge;
        return Math.sqrt((p - upperBase) * (p - bottomBase) * (p - edge) * (p - edge));

    }

    @Override
    public void draw() {
        System.out.println("IsoscelesTrapezoid, area: " + countArea()
                           + " sq.units bottomBase: " + bottomBase + " units, upperBase: "
                           + upperBase + " units, edge: " + edge + " units, color: " + getColor());
    }
}
