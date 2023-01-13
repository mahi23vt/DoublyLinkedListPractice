public class NumberNode {
    public Number number;
    public NumberNode next,previous;

    public NumberNode(Number number) {
        this.number = number;
    }

    public NumberNode(Number number, NumberNode next, NumberNode previous) {
        this.number = number;
        this.next = next;
        this.previous = previous;
    }

    public Number getNumber() {
        return number;
    }

    public void setNumber(Number number) {
        this.number = number;
    }

    public NumberNode getNext() {
        return next;
    }

    public void setNext(NumberNode next) {
        this.next = next;
    }

    public NumberNode getPrevious() {
        return previous;
    }

    public void setPrevious(NumberNode previous) {
        this.previous = previous;
    }
}
