package core.basesyntax;

public interface Roundable {
    default double getRoundedValue(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}
