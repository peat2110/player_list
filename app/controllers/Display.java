package controllers;
import play.mvc.Controller;
import play.mvc.Result;
import models.Player;

public class Display extends Controller{
    public static Result show(){
        return ok("show");
    }
}
