package core.basesyntax;

public class Circle extends Figure implements InitializingProperties, DrawFigures {
    public static final int CIRCLE_COUNT = 10;
    public int radius = CIRCLE_COUNT;

    public Circle() {
        super.name = "Circle";
        super.color = "WHITE";
        getDraw();
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure : " + super.name + ", area : " + getArea()
                + " units, radius : " + radius + " units, color : " + super.color);
    }
}
