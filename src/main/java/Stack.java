public class Stack {

    private Integer size = 0;
    private String element;

    public Integer size() {
        return size;
    }

    public void push(String element) {
        this.element = element;
        size++;
    }

    public boolean isEmpty() {
        return true;
    }

    public String top() {
        return this.element;
    }
}
