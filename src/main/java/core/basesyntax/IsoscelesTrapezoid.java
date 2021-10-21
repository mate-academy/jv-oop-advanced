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
        float valueOfArea = countArea();
        setArea(valueOfArea);
    }

    @Override
    public float countArea() {
        //Brahmagupta formula
        float p = upperBase + bottomBase + 2 * edge;
        return (float) (Math.sqrt(p - upperBase) * (p - bottomBase) * (p - edge) * (p - edge));
    }

    @Override
    public void draw() {
        System.out.println("IsoscelesTrapezoid, " + "area: " + getArea()
                + " sq.units" + " bottomBase: " + bottomBase
                + " units" + " upperBase: " + upperBase + " units" + " edge: "
                + " units" + ", color: " + getColor());
    }
}
