package LeetCodeSolutions.Solution_21;

public class LL {
    private Node head;
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
    public static LL merge(LL first, LL second){
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while(f != null && s != null){
            if(f.value < s.value){
                ans.insertAtLast(f.value);
                f = f.next;
            }
            else{
                ans.insertAtLast(s.value);
                s = s.next;
            }
        }

        while(f != null){
            ans.insertAtLast(f.value);
            f = f.next;
        }
        while(s != null){
            ans.insertAtLast(s.value);
            s = s.next;
        }

        return ans;
    }

    public static void main(String[] args) {
        LL first = new LL();
        LL second = new LL();

        first.insertAtLast(1);
        first.insertAtLast(2);
        first.insertAtLast(4);
        first.display();

        second.insertAtLast(1);
        second.insertAtLast(3);
        second.insertAtLast(4);
        second.display();

        System.out.println("After merging the new linked list is : ");
        LL ans = merge(first, second);
        ans.display();

    }

}
