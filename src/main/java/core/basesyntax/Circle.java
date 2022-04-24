package core.basesyntax;

public class Circle extends Figure implements figureArea {
    private int radius;
    public Circle(int radius) {
        this.radius = radius;
    }
    @Override
    public double getFigureArea() {
        return Math. round(Math.PI * radius * radius*10)/10;
    }
    @Override
    public String getFigureInfo() {
        return "circle, area: " + getFigureArea() +
                " sq.units, radius: " + radius + " units, color: " + super.color;
    }
}
