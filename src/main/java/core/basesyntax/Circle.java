package core.basesyntax;

public class Circle extends Figure {
    private double area;
    private double radius;
    private Color color;

    public Circle(double radius, Color randomColorIndex) {
        this.radius = radius;
        this.color = randomColorIndex;

        draw();
    }

    @Override
    public Enum getColor() {
        setColor(color);
        return super.getColor();
    }

    @Override
    public void setColor(Enum color) {
        super.setColor(color);
    }

    @Override
    public double getArea() {
        setArea(Math.PI * radius * radius);
        return super.getArea();
    }

    @Override
    public void draw() {
        System.out.println("Circle , area : " + getArea()
                           + " , Radius = " + getRadius()
                            + " , Color = " + getColor());
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
