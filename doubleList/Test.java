package doubleList;

public class Test {
    public static void main(String[] args) {
        DoubleLinkedList d1 = new DoubleLinkedList();
        DoubleLinkedList.Node node1 = new DoubleLinkedList.Node(25);
        DoubleLinkedList.Node node2 = new DoubleLinkedList.Node(72);
        DoubleLinkedList.Node node3 = new DoubleLinkedList.Node(42);
        DoubleLinkedList.Node node4 = new DoubleLinkedList.Node(75);
        DoubleLinkedList.Node node5 = new DoubleLinkedList.Node(74);
        DoubleLinkedList.Node node6 = new DoubleLinkedList.Node(25);
        DoubleLinkedList.Node node7 = new DoubleLinkedList.Node(37);
        DoubleLinkedList.Node node8 = new DoubleLinkedList.Node(67);
        DoubleLinkedList.Node node9 = new DoubleLinkedList.Node(75);
        DoubleLinkedList.Node node10 = new DoubleLinkedList.Node(41);

        DoubleLinkedList.Node node11 = new DoubleLinkedList.Node(55);
        d1.add(node1);
        d1.add(node2);
        d1.add(node3);
        d1.add(node4);
        d1.add(node5);
        d1.add(node6);
        d1.add(node7);
        d1.add(node8);
        d1.add(node9);
        d1.add(node10);
        d1.add(node11);

        d1.list();  //初始链表
        d1.addByIndex(node2,4); //讲node8的值给到4结点后
        d1.list();
        System.out.println("-----------");
        d1.del(75);   //删除值为75的结点
        d1.list();
        System.out.println("-----------");
        d1.alter(5,60);  //结点为5的值改为60
        d1.list();
        System.out.println("--------------");
    }
}
