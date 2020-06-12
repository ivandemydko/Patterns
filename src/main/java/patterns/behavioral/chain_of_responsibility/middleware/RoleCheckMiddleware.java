package patterns.behavioral.chain_of_responsibility.middleware;

public class RoleCheckMiddleware extends Middleware {

    @Override
    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("Access to admin resources");
            return checkNext(email, password);
        }
        System.out.println("Access to user resources");
        return checkNext(email, password);
    }
}
