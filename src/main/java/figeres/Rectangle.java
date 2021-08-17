package figeres;

public class Rectangle extends Figure implements Drawable {
    private int height;
    private int width;

    public Rectangle(String color, int height, int width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units"
                + ", height: " + getHeight() + " units"
                + ", width: " + getWidth() + " units"
                + ", color: " + getColor());
    }

    @Override
    public double getArea() {
        return height * width;
    }
}
