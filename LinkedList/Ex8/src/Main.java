

// Complete the compareLists function below.

/*
 * For your reference:
 *
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode next;
 * }
 *
 */
static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        int check = 1;
        while(head1 != null && head2 != null){
        int a = head1.data;
        int b = head2.data;
        if(a != b){
        check = 0;
        break;
        }
        else{
        head1 = head1.next;
        head2 = head2.next;
        }
        }
        if(check == 0){
        return false;
        }
        else {
        if(head1 == null && head2 != null){
        return false;
        }
        else if (head1 != null && head2 == null){
        return false;
        }
        else if (head1 == null && head2 == null){
        return true;
        }
        }
        return false;
        }
