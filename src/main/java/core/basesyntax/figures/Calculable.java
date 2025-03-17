package core.basesyntax.figures;

public interface Calculable {

    default double getArea() {
        throw new RuntimeException("Can't get area of this figure.");
    }
}
