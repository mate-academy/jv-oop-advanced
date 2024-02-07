package core.basesyntax;

//import java.util.Random;

public class Rectangle extends Figure {
    private int side1;
    private int side2;

    public Rectangle() {
    }

    public Rectangle(Color color, int side1, int side2) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public float getArea() {
        return side1 * side2;
    }

    @Override
    public void drawFigure(Figure randomFigure) {
        String info = "Figure: rectangle, area: " + getArea() + "sq. units, side1: " + side1
                + " units, side2: " + side2 + " units, color: " + getColor().name();
        System.out.println(info);
    }

    /*@Override
    public Figure buildFigure() {
        super.setColor(ColorSupplier.getRandomColor());
        int side1 = new Random().nextInt(LENGTH_LIMIT);
        int side2 = new Random().nextInt(LENGTH_LIMIT);
        return new Rectangle(super.getColor(), side1, side2);
    } */
}
