
/**
 Remove duplicates from unsorted linked list
 */


import java.util.HashSet;

public class RD {


    // Implement using hash table to store elements and check for duplicates
    void delDups(LinkedListNode n){

        HashSet<Integer> set = new HashSet<Integer>();
        LinkedListNode previous = null;

        while(n != null){
            if(set.contains(n.data))
                previous.next = n.next;
            else{
                set.add(n.data);
                previous = n;
            }
            n = n.next;
        }

    }

}
