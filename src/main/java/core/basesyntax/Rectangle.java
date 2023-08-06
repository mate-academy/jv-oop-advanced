package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Rectangel color is ").append(getColor()).append(", area: ")
                .append(getArea()).append(", width: ").append(width).append(", height: ")
                .append(height);
        System.out.println(stringBuilder);

    }
}
