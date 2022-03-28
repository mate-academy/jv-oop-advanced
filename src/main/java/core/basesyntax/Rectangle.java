package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("I'm a rectangle with ")
                .append(getColor())
                .append(" color")
                .append(" and ")
                .append(getArea())
                .append(" m^2 area");
        System.out.println(builder);
    }

    @Override
    public double getArea() {
        double preRound = width * height;
        String result = String.format("%.3f", preRound);
        return Double.parseDouble(result);
    }
}
