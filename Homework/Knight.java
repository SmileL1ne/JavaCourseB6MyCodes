package Homework;

public class Knight {
    private int age;
    private String regionOfService;
    private int kills;

    public Knight() {
    }

    public Knight(int age, String regionOfService, int kills){
        this.age = age;
        this.regionOfService = regionOfService;
        this.kills = kills;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRegionOfService() {
        return regionOfService;
    }

    public void setRegionOfService(String regionOfService) {
        this.regionOfService = regionOfService;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }
}
