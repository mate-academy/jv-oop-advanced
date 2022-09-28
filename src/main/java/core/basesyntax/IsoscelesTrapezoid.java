package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int top;
    private int bottom;
    private int height;

    IsoscelesTrapezoid(String color, int top, int bottom, int height) {
        super(color);
        this.top = top;
        this.bottom = bottom;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "+getArea()+" sq.units, top: "+getTop()+" units, bottom: "+getBottom()+" units, height: "+getHeight()+" color: "+getColor());
    }

    @Override
    public double getArea() {
        double area = (top + bottom) * height / 2;
        return Math.ceil(area * 10) / 10;
    }

    public int getTop() {
        return top;
    }

    public int getBottom() {
        return bottom;
    }

    public int getHeight() {
        return height;
    }
}
