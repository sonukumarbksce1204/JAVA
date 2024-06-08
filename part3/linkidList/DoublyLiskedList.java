

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

    void insertLast(int value){
        Node node=new Node(value);
        node.prev=tail;
        node.next=null;
        if(tail!=null){
            tail.next=node;
        }
        if(head==null) head=tail;
        tail=node;
        size++;
    }

    void insertLastWT(int value){
        Node node=new Node(value);
        Node ptr=head;
        if(head==null){
            node.prev=null;
            head=node;
            return ;
        }
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        node.next=null;
        node.prev=ptr;
        ptr.next=node;
        tail=node;
        size++;
    }

    void insertIndex(int value, int index){
        if(index==0){
            insertFirst(value);
            return;
        }
        if(index==size+1){
            insertLast(value);
            return;
        }
        Node ptr=head;
        for(int i=0;i<index-1;i++){
            ptr=ptr.next;
        }
        Node node=new Node(value);
        node.next=ptr.next;
        node.prev=ptr;
        
        ptr.next=node;
        ptr.next.next.prev=node;
        
        size++;

    }

    int deleteFirst(){
        int val=head.value;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }
    
    int deleteLast(){
        int val=tail.value;
        tail=tail.prev;
        tail.next=null;
        size--;
        return val;
    }

    int deleteIndex(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node ptr=head;
        for(int i=0;i<index-1;i++)ptr=ptr.next;
        int val=ptr.next.value;
        Node del=ptr.next;
        ptr.next=del.next;
        del.next.prev=ptr;
        size--;
        return val;
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
        dd.insertLast(15);
        dd.insertLast(20);
        dd.displayFor();
        dd.displayRev();
        dd.insertLastWT(25);
        dd.insertLastWT(30);
        dd.displayFor();
        dd.displayRev();
        dd.insertIndex(101,2);
        dd.displayFor();
        dd.displayRev();
        System.out.println(dd.deleteFirst());
        dd.displayFor();
        dd.displayRev();
        System.out.println(dd.deleteLast());
        dd.displayFor();
        dd.displayRev();
        System.out.println(dd.deleteIndex(1));
        dd.displayFor();
        dd.displayRev();
    }
}
