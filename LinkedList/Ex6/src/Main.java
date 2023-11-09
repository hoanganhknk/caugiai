


    /*
     * Complete the 'reversePrint' function below.
     *
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

    public static void reversePrint(SinglyLinkedListNode llist) {
            // Write your code here
            int[] a = new int [1005];
            int index = 0;
            while(llist != null){
            a[index] = llist.data;
            llist = llist.next;
            index++;
            }
            for(int i = index - 1; i >= 0; i--){
            System.out.println(a[i]);
            }
            }

