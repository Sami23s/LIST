public class Element {
    private int data;
    private Element next;

    public Element getPrev() {
        return prev;
    }

    static Element reverse(Element head) {
        if (head == null || head.next == null)
            return head;

        Element rest = reverse(head.next);
        head.next.next = head;

        head.next = null;
        return rest;}

    public void setPrev(Element prev) {
        this.prev = prev;
    }

    private Element prev;


    public Element(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }


}