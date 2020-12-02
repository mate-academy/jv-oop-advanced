package core.basesyntax;

public class Circle extends Figure implements Drawable {
    private final double radius;

    public Circle(double radius,Color color) {
        this.radius = radius;
        this.color = color;
        this.area = Math.pow(radius,2) * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println(new StringBuilder("Circle: area: ")
                .append(area)
                .append(", color: ")
                .append(color)
                .append(", diameter ")
                .append(2 * radius));
    }
}
