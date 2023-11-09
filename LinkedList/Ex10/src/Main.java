


    /*
     * Complete the 'getNode' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_SINGLY_LINKED_LIST llist
     *  2. INTEGER positionFromTail
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

    public static int getNode(SinglyLinkedListNode llist, int positionFromTail) {
            // Write your code here
            int[] a = new int [1000];
            int index = 0;
            while(llist != null){
            a[index] = llist.data;
            llist = llist.next;
            index++;
            }
            return a[index - 1 - positionFromTail];
            }


