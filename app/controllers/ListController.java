package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import models.Player;
import java.util.List;
import java.util.ArrayList;
import views.html.display;

public class ListController extends Controller{
    private static List<Player> players;
    static {
        players = new ArrayList<Player>();
        players.add(new Player("Peter",13,"Warrior"));
        players.add(new Player("Adam",15,"Magician"));
        players.add(new Player("Cherry",10,"Archer"));
    }
    public static Result show(){
        return ok(views.html.display.render(players));
    }
}
