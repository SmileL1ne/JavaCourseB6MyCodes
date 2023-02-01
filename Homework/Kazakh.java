package Homework;

public class Kazakh {
    private int age;
    private String[] zhetiAta;
    private boolean doEatHorseMeat;
    private boolean doLoveKazakhstan;

    public Kazakh(int age, String[] zhetiAta, boolean doEatHorseMeat, boolean doLoveKazakhstan) {
        this.age = age;
        this.zhetiAta = zhetiAta;
        this.doEatHorseMeat = doEatHorseMeat;
        this.doLoveKazakhstan = doLoveKazakhstan;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getZhetiAta() {
        return zhetiAta;
    }

    public void setZhetiAta(String[] zhetiAta) {
        this.zhetiAta = zhetiAta;
    }

    public boolean isDoEatHorseMeat() {
        return doEatHorseMeat;
    }

    public void setDoEatHorseMeat(boolean doEatHorseMeat) {
        this.doEatHorseMeat = doEatHorseMeat;
    }

    public boolean isDoLoveKazakhstan() {
        return doLoveKazakhstan;
    }

    public void setDoLoveKazakhstan(boolean doLoveKazakhstan) {
        this.doLoveKazakhstan = doLoveKazakhstan;
    }
}
