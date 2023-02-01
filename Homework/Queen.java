package Homework;

public class Queen {
    private int age;
    private int countOfChildren;
    private boolean isHappy;
    private String futurePlans;

    public Queen(int age, int countOfChildren, boolean isHappy, String futurePlans) {
        this.age = age;
        this.countOfChildren = countOfChildren;
        this.isHappy = isHappy;
        this.futurePlans = futurePlans;
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

    public boolean isHappy() {
        return isHappy;
    }

    public void setHappy(boolean happy) {
        isHappy = happy;
    }

    public String getFuturePlans() {
        return futurePlans;
    }

    public void setFuturePlans(String futurePlans) {
        this.futurePlans = futurePlans;
    }

}
