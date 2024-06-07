import java.util.*;

public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player[] players = new Player[4];
        

    }

    public static int findplayerwithlowestruns(Player[] players, String type) {
        int runs = 999999;
        int count = 0;
        for (Player i : players) {
            if (i.getptype().equalsIgnoreCase(type)) {
                if (runs > i.getruns()) {
                    runs = i.getruns();
                    count++;
                }
            }
        }
        if (count == 0) {
            return 0;
        }
        return runs;
    }

    public static Player[] sec(Player[] players, String type) {
        ArrayList arr = new ArrayList<>();
        for (Player i : players) {
            if (i.getmtype().equalsIgnoreCase(type)) {
                arr.add(i);
            }
        }
        if (arr.size() == 0) {
            return null;
        }
        Player[] result = new Player[arr.size()];
        result = arr.toArray(result);
        Arrays.sort(result, Comparator.comparingInt(Player::getid));
        return result;
    }
}

class Player {
    private int id, runs;
    private String name, ptype, mtype;

    public Player(int id, String name, int runs, String ptype, String mtype) {
        this.id = id;
        this.name = name;
        this.runs = runs;
        this.ptype = ptype;
        this.mtype = mtype;
    }

    public int getid() {
        return this.id;
    }

    public String getname() {
        return this.name;
    }

    public String getmtype() {
        return this.mtype;
    }

    public String getptype() {
        return this.ptype;
    }

    public int getruns() {
        return this.runs;
    }
}