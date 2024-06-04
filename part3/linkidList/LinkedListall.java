// package part3.linkidList;

class LL{
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size=0;
    }

    public void insertFirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    void insertLast(int value){
        Node node=new Node(value);
        tail.next=node;
        tail=node;
        size+=1;
    }

    void insertEndNt(int value){
        Node node =new Node(value);
        if(head==null){
            head=node;
            tail=node;
        }
        else{
        Node ptr=head;
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next=node;
        tail=node;
        }
        size++;
    }

    int deleteStart(){
        int val=head.value;
        head=head.next;
        size--;
        return val;
        
    }
    int deleteEnd(){
        Node secl=second(size-2);
        int value=secl.next.value;
        secl.next=null;
        size--;
        return value;
    }
    Node second(int index){
        Node ptr=head;
        for(int i=0;i<index;i++){
            ptr=ptr.next;
        }
        return ptr;
    }

    int deleteIndex(int index){
        if(index==0){
            return deleteStart();
        }
        if(index==size-1){
            return deleteEnd();
        }
        Node ptr=head;
        for(int i=0;i<index-1;i++){
            ptr=ptr.next;
        }
        int val=ptr.next.value;
        ptr.next=ptr.next.next;
        return val;
    }

    void insertIndex(int value,int index){
        if(size==0){
            insertFirst(value);
            return;
        }
        if(size==index){
            insertLast(value);
            return;
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(value,temp.next);
        temp.next=node;
        size++;

    }

    Node find(int value){
        Node ptr=head;
        while(ptr!=null){
            if(ptr.value==value){
                return ptr;
            }
            ptr=ptr.next;
        }
        return null;
    }

    void display(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.value+"->");
            temp=temp.next;   
        }
        System.out.println("End");
    }
    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
    

}

public class LinkedListall{
    public static void main(String[] args){
        LL li=new LL();
        li.insertFirst(10);
        li.insertFirst(15);
        li.display();
        li.insertLast(20);
        li.insertLast(25);
        li.display();
        li.insertLast(30);
        li.display();
        li.insertLast(35);
        li.display();
        li.insertLast(40);
        li.display();
        li.insertIndex(101,1);
        li.display();
        System.out.println(li.deleteStart());
        li.display();
        System.out.println(li.deleteEnd());
        li.display();
        System.out.println(li.deleteEnd());
        li.display();
        System.out.println(li.deleteIndex(2));
        li.display();
        System.out.println(li.find(101));
    }
}