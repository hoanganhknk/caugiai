
    /*
     * Complete the 'insertNodeAtPosition' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts following parameters:
     *  1. INTEGER_SINGLY_LINKED_LIST llist
     *  2. INTEGER data
     *  3. INTEGER position
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
            // Write your code here
            SinglyLinkedListNode temp = llist;
            while(position > 1){
            llist = llist.next;
            position--;
            }
            SinglyLinkedListNode temp2 = llist.next;
            llist.next = new SinglyLinkedListNode(data);
            llist.next.next = temp2;
            return temp;
            }


