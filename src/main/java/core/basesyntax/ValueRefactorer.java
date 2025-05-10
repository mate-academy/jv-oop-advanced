package core.basesyntax;

public interface ValueRefactorer {
    default double roundValues(double value) {
        return (double)Math.round(value * 1000d) / 1000d;
    }
}
