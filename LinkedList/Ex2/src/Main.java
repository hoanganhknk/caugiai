

// Complete the insertNodeAtTail function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode next;
 * }
 *
 */
static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        if(head == null){
        head = new SinglyLinkedListNode(data);
        return head;
        }
        SinglyLinkedListNode temp = head;
        while(head.next != null){
        head = head.next;
        }
        head.next = new SinglyLinkedListNode(data);
        return temp;
        }

