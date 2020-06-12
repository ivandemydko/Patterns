package patterns.behavioral.state.state;

import patterns.behavioral.state.runner.Runner;

public abstract class State {

   private Runner runner;

    public State(Runner runner) {
        this.runner = runner;
    }

    public abstract void accelerate();

    public abstract void slowDown();

    public Runner getRunner() {
        return runner;
    }
}
