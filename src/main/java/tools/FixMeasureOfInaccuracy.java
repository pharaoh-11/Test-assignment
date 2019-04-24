package tools;

public final class FixMeasureOfInaccuracy {
    public static double fixInaccuracy(double number) {
        return Math.rint(number * 100000) / 100000;
    }
}

