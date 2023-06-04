package LoopableNode;

import java.util.Iterator;
import java.util.NoSuchElementException;

//https://www.youtube.com/watch?v=arkoC146TfQ
// Implementing a Custom Iterator in Java
public class MyLinkedList implements Iterable<Node> {
    Node head;
    Node tail;
    public void add(Node node)
    {
        if(head==null)
        {
            head= node;
            tail = node;
        }
        else
        {
            tail.setNextNode(node);
            tail = node;
        }
    }

    @Override
    public Iterator<Node> iterator() {
        return new MyLinkedListIterator();
    }
   class MyLinkedListIterator implements Iterator<Node>
   {

       Node current=null;
       @Override
       public boolean hasNext() {
           if(current == null && head!=null)
           {
               return true;
           }
           else if(current!=null)
           {
               return current.getNextNode()!=null;
           }
           return false;
       }

       @Override
       public Node next() {

           if(current==null && head!=null)
           {
               current=head;
               return head;
           }
           else if(current!=null)
           {
               current = current.next;
               return current;
           }
           throw  new NoSuchElementException();
       }
   }
}
