public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(String name, String color, double width, double height) {
        super(name, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Rectangle{"
                + "name='" + getName() + '\''
                + ", area=" + getArea() + '\''
                + ", color='" + getColor() + '\''
                + ", width=" + width
                + ", height=" + height
                + '}';
    }
}
