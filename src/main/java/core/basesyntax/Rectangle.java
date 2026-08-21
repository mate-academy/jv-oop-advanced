package core.basesyntax;

public class Rectangle extends Figure implements Drawable, AreaCalculator {
    private int length;
    private int width;

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        builder.append(" ----Figure: rectangle----")
                .append("\n area: " + calculateArea() + " sq. units")
                .append("\n length: " + length + " units")
                .append("\n width: " + width + " units")
                .append("\n color: " + getColor());
        System.out.println(builder);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}
