package core.basesyntax;

public abstract class IsoscelesTrapezoid extends Figure implements Obtainable, Drawable {
    private static final String name = "IsoscelesTrapezoid";
    private double topBase;
    private double bottomBase;
    private double height;
    private double area;

    public IsoscelesTrapezoid(Color color, double topBase, double bottomBase, double height, double area, String name) {
        super(color, name);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
        this.area = area;
    }

    @Override
    public void obtain() {
        area = ((topBase + bottomBase) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name
                + ", Area: " + area
                + " Color: " + getColor());
    }

}
