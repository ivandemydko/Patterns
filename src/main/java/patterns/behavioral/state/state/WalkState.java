package patterns.behavioral.state.state;

import patterns.behavioral.state.runner.Runner;

public class WalkState extends State {

    public WalkState(Runner runner) {
        super(runner);
    }

    @Override
    public void accelerate() {
        System.out.println("Runner begins run");
        getRunner().setState(new RunState(getRunner()));
    }

    @Override
    public void slowDown() {
        System.out.println("Runner is just walking");
    }
}
