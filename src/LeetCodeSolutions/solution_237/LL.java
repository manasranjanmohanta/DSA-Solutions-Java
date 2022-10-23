package LeetCodeSolutions.solution_237;

public class LL {
        private static Node head;
        private Node tail;
        private int size;
        public LL(){
            this.size = 0;
        }
        private class Node{
            int value;
            Node next;

            public Node(int value) {
                this.value = value;
            }

            public Node(int value, Node next) {
                this.value = value;
                this.next = next;
            }
        }
        public void display(){
            Node ptr = head;
            while(ptr != null){
                System.out.print(ptr.value + " -> ");
                ptr = ptr.next;
            }
            System.out.println("END");
        }
    public void insertAtFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }
    public void insertAtLast(int value){
        if(head == null){
            insertAtFirst(value);
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node node = new Node(value);
        temp.next = node;
        size++;
        tail = node;
        tail.next = null;
    }
    public void deleteNode(Node node) {
        node.value = node.next.value;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtLast(4);
        list.insertAtLast(5);
        list.insertAtLast(1);
        list.insertAtLast(9);
        list.display();

        list.deleteNode(head.next);
        list.display();
    }
}
