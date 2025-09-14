package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(Color color, double width, double height) {
        super(color);
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Sides must > 0");
        }
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder("Figure: rectangle, ");
        builder.append("area: ").append(String.format("%.1f",getArea())).append(" sq. units, ");
        builder.append("width: ").append(getWidth()).append(" units, ");
        builder.append("height: ").append(getHeight()).append(" units, ");
        builder.append("color: ").append(getColor().name());
        System.out.println(builder.toString());
    }
}
