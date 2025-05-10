package core.basesyntax;

public class Rectangle extends Figure {
    private final int heigth;
    private final int weigth;

    public Rectangle(int heigth, int weigth, String color) {
        super(color);
        this.heigth = heigth;
        this.weigth = weigth;
    }

    public int getHeigth() {
        return heigth;
    }

    public int getWeigth() {
        return weigth;
    }

    @Override
    public double getArea() {
        return heigth * weigth;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area:" + getArea()
                          + " sq.units , Heigth: " + getHeigth()
                          + " units, Weigth: " + getWeigth() + " units, color: " + getColor());
    }
}
