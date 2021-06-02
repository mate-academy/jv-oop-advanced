package behavior;

public abstract class Figure extends ColorSupplier {
    private Colors color;

    protected Figure() {
    }

    public abstract double getArea();
}
