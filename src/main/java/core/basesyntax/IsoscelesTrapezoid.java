package core.basesyntax;

public class IsoscelesTrapezoid extends FigureAbstract {
    private static IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
    private int length;
    private int width;
    private int height;
    private int area;

    protected IsoscelesTrapezoid(String color, int length, int width, int height) {
        super(color);
        this.length = length;
        this.width = width;
        this.height = height;
        area = getArea();
    }

    public IsoscelesTrapezoid() {

    }

    @Override
    public int getArea() {
        return ((length + width) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                +
                isoscelesTrapezoid.getClass().getSimpleName().toLowerCase()
                +
                ", area: " + area
                +
                ", length: " + length
                +
                ", width: " + width
                +
                ", height: " + height
                +
                ", color: " + getColor());
    }
}
