package patterns.behavioral.state.state;

import patterns.behavioral.state.runner.Runner;

public class RunState extends State {


    public RunState(Runner runner) {
        super(runner);
    }

    @Override
    public void accelerate() {
        System.out.println("Runner begins sprint");
        getRunner().setState(new SprintState(getRunner()));
    }

    @Override
    public void slowDown() {
        System.out.println("Runner begins walking");
        getRunner().setState(new WalkState(getRunner()));
    }
}
