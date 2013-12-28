package models;

public class Player{
    public String name;
    public String level;
    public String className;
    public Player(){}

    public Player(String name, String level, String className){
        this.name = name;
        this.level = level;
        this.className = className;
    }
    public static Player createPlayer(String name, String level, String className){
        return new Player(name, level, className);
    }
}
