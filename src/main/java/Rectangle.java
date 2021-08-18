public class Rectangle extends Figure implements FigureInterface {
    private double width;
    private double height;

    public Rectangle(String name) {
        super(name);
        this.width = Math.random();
        this.height = Math.random();

    }

    @Override
    public double areaValue() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Rectangle{"
                + "name='" + this.getName() + '\''
                + ", area=" + this.getArea() + '\''
                + ", color='" + this.getColor() + '\''
                + ", width=" + width
                + ", height=" + height
                + '}';
    }
}
