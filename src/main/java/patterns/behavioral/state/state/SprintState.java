package patterns.behavioral.state.state;

import patterns.behavioral.state.runner.Runner;

public class SprintState extends State {


    public SprintState(Runner runner) {
        super(runner);
    }

    @Override
    public void accelerate() {
        System.out.println("Runner can't run faster");
    }

    @Override
    public void slowDown() {
        System.out.println("Runner ends sprint end begins run");
        getRunner().setState(new RunState(getRunner()));
    }
}
