


    /*
     * Complete the 'reverse' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts INTEGER_SINGLY_LINKED_LIST llist as parameter.
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

    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
            // Write your code here
            int[] a = new int [1000];
            int index = 0;
            while(llist != null){
            a[index] = llist.data;
            llist = llist.next;
            index++;
            }
            SinglyLinkedListNode res = new SinglyLinkedListNode(a[index-1]);
            SinglyLinkedListNode temp = res;
            for(int i = index -2 ; i>=0; i--){
            res.next = new SinglyLinkedListNode(a[i]);
            res = res.next;
            }
            return temp;
            }


