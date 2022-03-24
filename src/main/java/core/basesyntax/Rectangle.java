package core.basesyntax;

public class Rectangle extends Figure {
    private double area;
    private int topSide;
    private int rightSide;

    public Rectangle(String color, int topSide, int rightSide) {
        super(color);

        this.topSide = topSide;
        this.rightSide = rightSide;
        this.area = topSide * rightSide;
    }

    @Override
    public String toString() {
        return "Figure: rectangle"
                + ", area: " + area + " sq.units"
                + ", topSide: " + topSide + " units"
                + ", rightSide: " + rightSide + " units"
                + ", color: " + super.getColor().toLowerCase();
    }

    @Override
    public void draw() {
        System.out.println(this);
    }
}

// Площадь прямоугольника равна произведению его смежных сторон.
