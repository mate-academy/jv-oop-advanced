package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
        super.setColor(color);
        this.radius = radius;
    }

    @Override
    public float getArea() {
        float area = (float)Math.PI * radius * radius;
        return area;
    }

    @Override
    public void drawFigure(Figure randomFigure) {
        String info = "Figure: circle, area :" + getArea() + "sq. units, radius: " + radius
                + " units, color: " + getColor().name();
        System.out.println(info);
    }
}


