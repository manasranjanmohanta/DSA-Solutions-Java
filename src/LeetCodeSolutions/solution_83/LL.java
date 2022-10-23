//83. Remove Duplicates from Sorted List
//Given the head of a sorted linked list, delete all duplicates
// such that each element appears only once. Return the linked list sorted as well.
//Example-1
//        Input: head = [1,1,2]
//        Output: [1,2]
package LeetCodeSolutions.solution_83;

public class LL {
    //  Definition for singly-linked list.
        private ListNode head;
        private ListNode tail;
        private int size;
        public LL(){
            this.size = 0;
        }
        public class ListNode {
            int val;
            ListNode next;

            ListNode() {
            }

            ListNode(int val) {
                this.val = val;
            }

            ListNode(int val, ListNode next) {
                this.val = val;
                this.next = next;
            }
        }
        public void display(){
            ListNode temp = head;
            while(temp != null){
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
            System.out.println("END");
        }

        public void insert(int value){
            ListNode node = new ListNode(value);
            node.next = head;
            head = node;
            if(tail == null){
                tail = head;
            }
            size++;
        }
        public void deleteDuplicates(){
            ListNode node = head;
            while(node.next != null){
                if(node.val == node.next.val){
                    node.next = node.next.next;
                    size--;
                }
                else{
                    node = node.next;
                }
            }
            tail = node;
            tail.next = null;

        }


    public static void main(String[] args) {
        LL list = new LL();
        list.insert(3);
        list.insert(3);
        list.insert(2);
        list.insert(2);
        list.insert(1);
        list.insert(1);
        list.display();

        System.out.println("After deleting duplicate nodes : ");
        list.deleteDuplicates();
        list.display();



    }
    }



