package patterns.behavioral.chain_of_responsibility.middleware;

public abstract class Middleware {
    private Middleware next;

    public Middleware linkWith(Middleware next) {
        this.next = next;
        return next;
    }

    protected boolean checkNext(String email, String password) {
        if (next != null) {
            return next.check(email,password);
        }
        return true;
    }

    public abstract boolean check(String email, String password);
}
