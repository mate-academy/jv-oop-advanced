package core.basesyntax;

public interface Figure {

    String getColor();

    double getArea();

    default String getName() {
        return this.getClass().getSimpleName().toLowerCase();
    }

    String display();
}
