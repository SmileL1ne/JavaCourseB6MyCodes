package Homework;

public class Student {
    private int age;
    private String course;
    private boolean doLoveUni;
    private boolean doMoneyProblems;

    public Student(int age, String course, boolean doLoveUni, boolean doMoneyProblems) {
        this.age = age;
        this.course = course;
        this.doLoveUni = doLoveUni;
        this.doMoneyProblems = doMoneyProblems;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public boolean isDoLoveUni() {
        return doLoveUni;
    }

    public void setDoLoveUni(boolean doLoveUni) {
        this.doLoveUni = doLoveUni;
    }

    public boolean isDoMoneyProblems() {
        return doMoneyProblems;
    }

    public void setDoMoneyProblems(boolean doMoneyProblems) {
        this.doMoneyProblems = doMoneyProblems;
    }
}
