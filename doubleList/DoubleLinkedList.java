package doubleList;

public class DoubleLinkedList {
    static class Node {
        Node next;
        Node pre;
        int num;

        public Node(int num) {
            this.num = num;
        }

        public String toString() {
            return "num=" + num+"\t";
        }
    }

    Node head = new Node(0);

    public void add(Node node) {
        Node temp = head;
        while (true) {
            if (temp.next == null)
                break;
            temp = temp.next;
        }
        temp.next = node;
        node.pre = temp;
    }

    public void addByIndex(Node node, int index) {
        Node temp = head;
        int count = 0;
        while (true) {
            if (temp.next == null)
                break;
            temp = temp.next;
            count++;
            if (index == count) {
                node.next = temp.next;
                node.pre = temp;
                temp.next = node;
            }
            while (node.next != null) {
                node.next.pre = node;
                break;
            }
            break;
        }
    }

    public void del(int num){
    Node temp = head;
    while(true){
        if(temp.next == null){
            System.out.println("链表为空或找不到结点");
            break;
        }
        temp = temp.next;
        if(temp.num == num){
            temp.pre.next = temp.next;
            while(temp.next != null)
                temp.next.pre = temp.pre;
            break;
        }
    }
}
    public void alter(int target , int val){
    Node temp = head;
    while(true){
        if(temp.next == null){
            System.out.println("链表为空或者找不到结点");
            break;
        }
        temp = temp.next;
        if(temp.num == target){
            temp.num = val;
            break;
        }
    }
}
    public void list() {
        Node temp = head;
        while (true) {
            if (temp.next == null)
                break;
            temp = temp.next;
            System.out.print(temp);
        }
    }
}



