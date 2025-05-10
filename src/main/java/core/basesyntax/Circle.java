package core.basesyntax;

//import java.util.Random;

public class Circle extends Figure {
    private int radius;

    public Circle() {
    }

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) Math.PI * radius * radius;
    }

    @Override
    public void drawFigure(Figure randomFigure) {
        String info = "Figure: circle, area :" + getArea() + "sq. units, radius: " + radius
                + " units, color: " + getColor().name();
        System.out.println(info);
    }

    /*@Override
    public Figure buildFigure() {
        super.setColor(ColorSupplier.getRandomColor());
        this.radius = new Random().nextInt(LENGTH_LIMIT);
        return new Circle(super.getColor(), this.radius);
    }*/
}


