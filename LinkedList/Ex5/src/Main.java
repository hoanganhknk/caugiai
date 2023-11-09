


    /*
     * Complete the 'deleteNode' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts following parameters:
     *  1. INTEGER_SINGLY_LINKED_LIST llist
     *  2. INTEGER position
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

    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
            // Write your code here
            SinglyLinkedListNode temp = llist;
            if(position == 0){
            return temp.next;
            }
            else{
            while(position > 1){
            llist = llist.next;
            position --;
            }
            llist.next = llist.next.next;
            }
            return temp;
            }


