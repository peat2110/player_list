package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import models.Player;
import java.util.List;
import java.util.ArrayList;
import views.html.display;
import views.html.add;
import play.data.Form;

public class PlayerList extends Controller{
    private static final Form<Player> playerForm = Form.form(Player.class);
    private static List<Player> players;
    static {
        players = new ArrayList<Player>();
        players.add(new Player("Peter","13","Warrior"));
        players.add(new Player("Adam","15","Magician"));
        players.add(new Player("Cherry","10","Archer"));
    }
    public static Result show(){
        return ok(views.html.display.render(players));
    }
    public static Result addPlayer(){
        return ok(add.render(playerForm));
    }
    public static Result save(){
        Form<Player> boundForm = playerForm.bindFromRequest();
        if(boundForm.hasErrors()){
            flash("error", "Please correct the form.");
            return badRequest(add.render(boundForm));
        }
        Player player = boundForm.get();
        players.add(player);
        flash("success", "Add success.");
        return redirect(routes.PlayerList.show());
    }
    public static Result delete(String name){
        Player target=null;
        for(Player player : players){
            if(player.name.equals(name)){
                target = player;
                break;
            }
        }
        players.remove(target);
        return redirect(routes.PlayerList.show());
    }
}
