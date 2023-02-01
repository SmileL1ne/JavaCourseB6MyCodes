package Homework;

public class Indian {
    private int age;
    private boolean doLoveHisCountry;
    private String shortDescriptionOfHisCountry;
    private boolean isHappy;

    public Indian(int age, boolean doLoveHisCountry, String shortDescriptionOfHisCountry, boolean isHappy) {
        this.age = age;
        this.doLoveHisCountry = doLoveHisCountry;
        this.shortDescriptionOfHisCountry = shortDescriptionOfHisCountry;
        this.isHappy = isHappy;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDoLoveHisCountry() {
        return doLoveHisCountry;
    }

    public void setDoLoveHisCountry(boolean doLoveHisCountry) {
        this.doLoveHisCountry = doLoveHisCountry;
    }

    public String getShortDescriptionOfHisCountry() {
        return shortDescriptionOfHisCountry;
    }

    public void setShortDescriptionOfHisCountry(String shortDescriptionOfHisCountry) {
        this.shortDescriptionOfHisCountry = shortDescriptionOfHisCountry;
    }

    public boolean isHappy() {
        return isHappy;
    }

    public void setHappy(boolean happy) {
        isHappy = happy;
    }
}
