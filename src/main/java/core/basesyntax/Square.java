package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("I'm a square with ")
                .append(getColor())
                .append(" color")
                .append(" and ")
                .append(getArea())
                .append(" m^2 area");
        System.out.println(builder);
    }

    @Override
    public double getArea() {
        double preRound = Math.pow(side, 2);
        String result = String.format("%.3f", preRound);
        return Double.parseDouble(result);
    }
}
