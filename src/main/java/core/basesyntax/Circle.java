package core.basesyntax;

public class Circle extends Figure implements Drawable, AreaCalculator {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        builder.append(" ----Figure: Circle----")
                .append("\n area: " + calculateArea() + " sq. units")
                .append("\n radius: " + radius + " units")
                .append("\n color: " + getColor());
        System.out.println(builder);
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
