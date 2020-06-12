package patterns.behavioral.state;

import patterns.behavioral.state.runner.Runner;

public class Main {
    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.accelerate();
        runner.accelerate();
        runner.accelerate();
        runner.accelerate();

        System.out.println("---------------------------");

        runner.slowDown();
        runner.slowDown();
        runner.slowDown();
        runner.slowDown();
    }
}
