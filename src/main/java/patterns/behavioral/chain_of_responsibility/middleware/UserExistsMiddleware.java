package patterns.behavioral.chain_of_responsibility.middleware;

import patterns.behavioral.chain_of_responsibility.server.Server;

public class UserExistsMiddleware extends Middleware {

    private Server server;

    public UserExistsMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if (server.isEmailExist(email) && server.isValidPassword(email, password)) {
            System.out.println("Authentication success");
            return checkNext(email, password);
        }
        System.out.println("Email or password is incorrect");
        return false;
    }
}
