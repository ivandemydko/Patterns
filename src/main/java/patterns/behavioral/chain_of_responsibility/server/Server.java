package patterns.behavioral.chain_of_responsibility.server;

import patterns.behavioral.chain_of_responsibility.middleware.Middleware;

import java.util.HashMap;
import java.util.Map;


public class Server {
    private Map<String, String> db = new HashMap<>();
    private Middleware middleware;

    {
        db.put("admin@example.com", "admin");
        db.put("user@example.com", "user");
    }

    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    public boolean isEmailExist(String email) {
        return db.containsKey(email);
    }

    public boolean isValidPassword(String email, String password) {
        return db.get(email).equals(password);
    }

    public boolean logIn(String email, String password) {
        if (middleware.check(email, password)) {
            System.out.println("Authorization have been successful!");
            return true;
        }
        return false;
    }
}
