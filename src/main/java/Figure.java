public abstract class Figure implements FigureInterface {
    protected double area;
    private String name;
    private String color;

    public Figure() {
    }

    public Figure(String name) {
        this.name = name;
        ColorSupplier colorSupplier = new ColorSupplier();
        this.color = colorSupplier.getRandomColor();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Figure{"
                + "name='" + name + '\''
                + ", color='" + color + '\''
                + '}';
    }
}
