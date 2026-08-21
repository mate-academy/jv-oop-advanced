package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Drawable, AreaCalculator {
    private int firstBase;
    private int secondBase;
    private int height;

    public int getFirstBase() {
        return firstBase;
    }

    public void setFirstBase(int firstBase) {
        this.firstBase = firstBase;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        builder.append(" ----Figure: isosceles trapezoid----")
                .append("\n area: " + calculateArea() + " sq. units")
                .append("\n first base: " + firstBase + " units")
                .append("\n second base: " + secondBase + " units")
                .append("\n height: " + height + " units")
                .append("\n color: " + getColor());
        System.out.println(builder);
    }

    @Override
    public double calculateArea() {
        return (double) (firstBase + secondBase) / 2 * height;
    }
}
