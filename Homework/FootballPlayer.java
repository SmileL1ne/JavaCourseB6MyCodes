package Homework;

public class FootballPlayer {
    private int age;
    private int leaderboardPosition;

    public FootballPlayer() {
    }
    public FootballPlayer(int age, int leaderboardPosition){
        this.age = age;
        this.leaderboardPosition = leaderboardPosition;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLeaderboardPosition() {
        return leaderboardPosition;
    }

    public void setLeaderboardPosition(int leaderboardPosition) {
        this.leaderboardPosition = leaderboardPosition;
    }
}

