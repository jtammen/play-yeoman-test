package controllers;

import play.*;
import play.mvc.*;

public class Application extends Controller {
    public static Result index() {
        return ok(views.html.index.render());
    }

    public static Result demo1() {
        return ok(views.html.demo1.render());
    }

    public static Result demo2() {
        return ok(html.demo2.render());
    }
}
