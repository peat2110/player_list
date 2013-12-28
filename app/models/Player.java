package models;

public class Player{
    public String name;
    public Integer level;
    public String className;

    public Player(String name, int level, String className){
        this.name = name;
        this.level = new Integer(level);
        this.className = className;
    }
    public static Player createPlayer(String name, int level, String className){
        return new Player(name, level, className);
    }
}
