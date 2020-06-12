package patterns.behavioral.state.runner;

import patterns.behavioral.state.state.State;
import patterns.behavioral.state.state.WalkState;

public class Runner {
    private State state;

    public Runner() {
        this.state = new WalkState(this);
    }

    public void accelerate() {
        state.accelerate();
    }

    public void slowDown() {
        state.slowDown();
    }

    public void setState(State state) {
        this.state = state;
    }
}
