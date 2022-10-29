package HashMap;

public class WorldCup {
    private String sessions;
    private String place;
    private String champion;
    public WorldCup(String sessions, String place, String champion) {
        this.sessions = sessions;
        this.place = place;
        this.champion = champion;
    }
    public WorldCup() {
    }
    public String getSessions() {
        return sessions;
    }
    public void setSessions(String sessions) {
        this.sessions = sessions;
    }
    public String getPlace() {
        return place;
    }
    public void setPlace(String place) {
        this.place = place;
    }
    public String getChampion() {
        return champion;
    }
    public void setChampion(String champion) {
        this.champion = champion;
    }
}

