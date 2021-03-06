package edu.ut.verify.core.statechart;

/**
 * Created by Jerry Wang on 2018/11/5.
 */
public class Predicate {

    private String variable;  //variable in this event
    private int[] boundary; // the boundary of the variable
    /**
     * in an event 0 < N <= 10
     * variable = N;
     * boundary = [1,10];
     */

    public Predicate() {
        this.variable = null;
        this.boundary = new int[2];
        this.boundary[0] = -200;
        //some variable don't have an explicate boundary, set default
        this.boundary[1] = 200;
    }

    public void setHigh(int high){
        this.boundary[1] = high;
    }

    public void setLow(int low){
        this.boundary[0] = low;
    }

    public int getHigh(){
        return this.boundary[1];
    }

    public int getLow(){
        return this.boundary[0];
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public int[] getBoundary() {
        return boundary;
    }

    public void setBoundary(int[] boundary) {
        this.boundary = boundary;
    }

    public String toString(){
        if(this.variable != null)
            return ""+boundary[0]+" <= "+variable+" <= "+boundary[1];
        else
            return "";
    }
}

