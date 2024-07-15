package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: the radius is")
                .append(radius)
                .append(" the color is: ")
                .append(color);
        System.out.println(builder.toString());
    }
}
