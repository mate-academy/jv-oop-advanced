package core.basesyntax;

public class Square extends Figure implements Parametrs {
    private double side;

    public Square(String name,String color, double side) {
        super(name, color);
        this.side = side;
        setArea();
    }

    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void getFigure() {
        System.out.println("---------------------------------");
        System.out.println("name: " + getName());
        System.out.println("color: " + getColor());
        System.out.println("area: " + getArea());
        System.out.println("side: " + side);
    }
}
