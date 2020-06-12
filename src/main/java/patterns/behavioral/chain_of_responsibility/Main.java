package patterns.behavioral.chain_of_responsibility;

import patterns.behavioral.chain_of_responsibility.middleware.Middleware;
import patterns.behavioral.chain_of_responsibility.middleware.OtherLogicMiddleware;
import patterns.behavioral.chain_of_responsibility.middleware.RoleCheckMiddleware;
import patterns.behavioral.chain_of_responsibility.middleware.UserExistsMiddleware;
import patterns.behavioral.chain_of_responsibility.server.Server;

public class Main {
    public static void main(String[] args) {

        Server server = new Server();
        Middleware middleware = new UserExistsMiddleware(server);
        middleware.linkWith(new RoleCheckMiddleware()).linkWith(new OtherLogicMiddleware());
        server.setMiddleware(middleware);
        server.logIn("user@example.com", "user");

        System.out.println("-----------------------------------------");

        server.logIn("admin@example.com", "admin");
    }
}
