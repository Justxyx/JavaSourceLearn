package design_pattern.p11状态模式.p3一个比较好理解的例子.重构;

/**
 * @author xm
 * @date 2021/9/17 12:01
 * @description:
 */
public class Elevator {
    private State run;
    private State stop;
    private State open;
    private State closed;

    private State currentState;


    public Elevator() {
        run = new Run(this);
        stop = new Stop(this);
        open = new Open(this);
        closed = new Closed(this);
        currentState = stop;
    }


    void run(){
        currentState.run();
        currentState = run;
    }

    void stop(){
        currentState.stop();
        currentState = stop;
    }

    void open(){
        currentState.open();
        currentState = open;
    }

    void closed(){
        currentState.closed();
        currentState = closed;
    }


    public State getRun() {
        return run;
    }

    public void setRun(State run) {
        this.run = run;
    }

    public State getStop() {
        return stop;
    }

    public void setStop(State stop) {
        this.stop = stop;
    }

    public State getOpen() {
        return open;
    }

    public void setOpen(State open) {
        this.open = open;
    }

    public State getClosed() {
        return closed;
    }

    public void setClosed(State closed) {
        this.closed = closed;
    }
}

