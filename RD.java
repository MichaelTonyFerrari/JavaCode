
/**
 Remove duplicates from unsorted linked list
 */

import java.util.HashSet;

public class RD {

    // Create LL 
    class Node{

        Node = null;
        int data;

        public Node(int d){
            data = d;
        }
        void appendtotail(int d){
            Node end = new Node(d);
            Node n = this;
            while(n.next != null)
            {
                n = n.next;
            }
            n.next = end;
        }

    }

    // Implement using hash table to store elements and check for duplicates
    void delDups(Node n){

        HashSet<Integer> set = new HashSet<Integer>();
        Node previous = null;

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
