package Homework;

public class King {
    private int age;
    private int yearsOfRule;
    private String characterOfHuman;

    public King(int age, int yearsOfRule, String characterOfHuman) {
        this.age = age;
        this.yearsOfRule = yearsOfRule;
        this.characterOfHuman = characterOfHuman;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearsOfRule() {
        return yearsOfRule;
    }

    public void setYearsOfRule(int yearsOfRule) {
        this.yearsOfRule = yearsOfRule;
    }

    public String getCharacterOfHuman() {
        return characterOfHuman;
    }

    public void setCharacterOfHuman(String characterOfHuman) {
        this.characterOfHuman = characterOfHuman;
    }
}
