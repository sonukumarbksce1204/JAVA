

class Doubly{
    private Node head;
    private Node tail;
    private int size=0;

    public Doubly(){
        this.size=0;
    }
    
    void insertFirst(int value){
        Node node=new Node(value);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        if(tail==null){
            tail=head;
        }
        head=node;
        size++;
        
    }
    void displayFor(){
        Node ptr=head;
        while(ptr!=null){
            System.out.print(ptr.value+"->");
            ptr=ptr.next;
        }
        System.out.println("End");
    }

    void displayRev(){
        Node ptr=tail;
        while(ptr!=null){
            System.out.print(ptr.value+"<-");
            ptr=ptr.prev;
        }
        System.out.println("Start");
    }

    class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next,Node prev){
            this.value=value;
            this.next=next;
            this.prev=prev;
        }
    }
}


public class DoublyLiskedList {
    public static void main(String[] args) {
        Doubly dd=new Doubly();
        dd.insertFirst(5);
        dd.displayFor();
        dd.insertFirst(10);
        dd.displayFor();
        dd.displayRev();
    }
}
