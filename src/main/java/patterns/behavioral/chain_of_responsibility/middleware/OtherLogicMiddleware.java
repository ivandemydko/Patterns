package patterns.behavioral.chain_of_responsibility.middleware;

public class OtherLogicMiddleware extends Middleware {

    @Override
    public boolean check(String email, String password) {
        System.out.println("Some other logic");
        return checkNext(email, password);
    }
}
