package Homework;

public class Mother {
    private int age;
    private int countOfChildren;
    private boolean isStillLovesFather;
    private String wishesInMarriage;

    public Mother(int age, int countOfChildren, boolean isStillLovesFather, String wishesInMarriage) {
        this.age = age;
        this.countOfChildren = countOfChildren;
        this.isStillLovesFather = isStillLovesFather;
        this.wishesInMarriage = wishesInMarriage;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCountOfChildren() {
        return countOfChildren;
    }

    public void setCountOfChildren(int countOfChildren) {
        this.countOfChildren = countOfChildren;
    }

    public boolean isStillLovesFather() {
        return isStillLovesFather;
    }

    public void setStillLovesFather(boolean stillLovesFather) {
        isStillLovesFather = stillLovesFather;
    }

    public String getWishesInMarriage() {
        return wishesInMarriage;
    }

    public void setWishesInMarriage(String wishesInMarriage) {
        this.wishesInMarriage = wishesInMarriage;
    }
}
