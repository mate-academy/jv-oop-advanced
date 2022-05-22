package core.basesyntax;

public class Rectangle extends Figure implements Area{
    public Rectangle(String color, String type) {
        super(color, type);
    }

    @Override
    public double getArea() {
        return 0;
    }
}
