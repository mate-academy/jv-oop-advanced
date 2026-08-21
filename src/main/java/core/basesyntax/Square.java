package core.basesyntax;

public class Square extends Figure implements Drawable, AreaCalculator {
    private int side;

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        builder.append(" ----Figure: isosceles trapezoid----")
                .append("\n area: " + calculateArea() + " sq. units")
                .append("\n side: " + side + " units")
                .append("\n color: " + getColor());
        System.out.println(builder);
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
