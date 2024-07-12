package assignment.design.patterns.behaviour;

class ContextState {
    private State state;

    public ContextState() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void doAction() {
        state.doAction(this);
    }
}

interface State {
    void doAction(ContextState context);
}

class StartState implements State {
    @Override
    public void doAction(ContextState context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}

class StopState implements State {
    @Override
    public void doAction(ContextState context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}

public class StatePattern {
    public static void main(String[] args) {
        ContextState context = new ContextState();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println("Current state: " + context.getState());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println("Current state: " + context.getState());
    }
}
