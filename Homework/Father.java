package Homework;

public class Father {
    private int age;
    private int countOfChildren;
    private boolean isInLoveWithMother;
    private boolean isProudOfKids;

    public Father(int age, int countOfChildren, boolean isInLoveWithMother, boolean isProudOfKids) {
        this.age = age;
        this.countOfChildren = countOfChildren;
        this.isInLoveWithMother = isInLoveWithMother;
        this.isProudOfKids = isProudOfKids;
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

    public boolean isInLoveWithMother() {
        return isInLoveWithMother;
    }

    public void setInLoveWithMother(boolean inLoveWithMother) {
        isInLoveWithMother = inLoveWithMother;
    }

    public boolean isProudOfKids() {
        return isProudOfKids;
    }

    public void setProudOfKids(boolean proudOfKids) {
        isProudOfKids = proudOfKids;
    }
}
