public class sortObject {
    
}

class Player {
    private int id, points;
    private String skill, level;

    public Player(int id, int points, String skills, String level) {
        this.id = id;
        this.points = points;
        this.skill = skills;
        this.level = level;
    }

    public int getId() {
        return this.id;
    }

    public int getpoints() {
        return this.points;
    }

    public String getskill() {
        return this.skill;
    }

    public String getLevel() {
        return this.level;
    }
}
