

class CC{
    private Node head;
    private Node tail;
    private int size;
    public CC(){
        this.size=0;
    }
    void insert(int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            tail=head;
            node.next=head;
            size++;
            return ;
        }
        tail.next=node;
        node.next=head;
        tail=node;
        size++;
    }

    void display(){
        Node ptr=head;
        System.out.print(ptr.value+"->");
        ptr=ptr.next;
        while(ptr!=head){
            System.out.print(ptr.value+"->");
            ptr=ptr.next;
        }
        System.out.print(ptr.value+"->");
        System.out.println("End");
    }
    private class Node{
        private Node next;
        private int value;
        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
}

public class CircularLinkedList {
    public static void main(String[] args) {
        CC obj=new CC();
        obj.insert(5);
        obj.insert(10);
        obj.insert(15);
        obj.display();


    }
}