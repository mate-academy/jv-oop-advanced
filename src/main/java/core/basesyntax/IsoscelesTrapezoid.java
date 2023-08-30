package core.basesyntax;

public class IsoscelesTrapezoid extends FigureAbstract {
    private int length;
    private int width;
    private int height;
    private int area;

    protected IsoscelesTrapezoid(String name, String color, int length, int width, int height) {
        super(name, color);
        this.length = length;
        this.width = width;
        this.height = height;
        this.area = getArea();
    }

    @Override
    public int getArea() {
        return ((length + width) / 2) * height;
    }

    @Override
    public String drawInfo() {
        return "Figure: "
                +
                getName()
                +
                ", area: " + area
                +
                ", length: " + length
                +
                ", width: " + width
                +
                ", height: " + height
                +
                ", color: " + getColor();
    }
}
