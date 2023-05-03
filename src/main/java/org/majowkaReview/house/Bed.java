package org.majowkaReview.house;

public class Bed {
    private int daysSinceCleanup;

    public Bed(int daysSinceCleanup) {
        this.daysSinceCleanup = daysSinceCleanup;
    }

    public int getDaysSinceCleanup() {
        return daysSinceCleanup;
    }

    public void setDaysSinceCleanup(int daysSinceCleanup) {
        this.daysSinceCleanup = daysSinceCleanup;
    }
}
