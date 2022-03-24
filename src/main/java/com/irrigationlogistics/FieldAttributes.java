package com.irrigationlogistics;

public class FieldAttributes {

    private long field;
    private long tap;
    private long numTaps;

    public long getField() {
        return field;
    }

    public void setField(long field) {
        this.field = field;
    }

    public long getTap() {
        return tap;
    }

    public void setTap(long tap) {
        this.tap = tap;
    }

    public long getNumTaps() {
        int sumOfRanges = 0;
        for (int range : ranges) {
            sumOfRanges += range;
        }
        if (sumOfRanges < n) {
            return -1;
        }
        int[] taps = new int[ranges.length];
        for (int i = 1; i < taps.length; i++) {
            taps[i] = n + 1;
        }
        for (int i = 0; i < ranges.length; i++) {
            int start = Math.max(i - ranges[i], 0);
            int end = Math.min(i + ranges[i], ranges.length - 1);
            for (int j = start; j <= end; j++) {
                taps[j] = Math.min(taps[j], taps[start] + 1);
            }
        }
        if (taps[taps.length - 2] == ranges.length - 1 && taps[taps.length - 1] == ranges.length) {
            return taps[ranges.length - 1];
        } else if (taps[ranges.length - 1] < (ranges.length)) {
            return taps[ranges.length - 1];
        } else {
            return -1;
        }
        return numTaps;
    }

    public void setNumTaps() {
        this.numTaps = field/tap;
    }


}