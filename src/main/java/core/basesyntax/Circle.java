package core.basesyntax;

public class Circle extends Figures {
    private final int radius;

    public Circle(String color, int radius) {
        super.setColor(color);
        super.setFigureType(" Circle");
        this.radius = radius;
    }

    @Override
    public double squareOfFigure() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String informationOfFigure() {
        return "Figure" + getType() + ", area " + squareOfFigure() + " sq.u., radius "
                + radius + " u., color " + getColor();
    }
}
