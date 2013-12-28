package models;
import play.data.validation.Constraints;

public class Player{
    @Constraints.Required
    public String name;
    @Constraints.Required
    public String level;
    @Constraints.Required
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
