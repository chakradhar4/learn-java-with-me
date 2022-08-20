

//implementation of linked list
class LinkedListClass{
    //creating node
    static Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next =null;
        }
    }
    //adding element at the start 
     void addFirst(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;    
    }
    //adding element at the last of the list 
     void addLast(int val){
        Node newNode = new Node(val);
        Node cur = head;
        if(head == null){
            head = newNode;
            return;
    }
    while(cur.next!= null){
        cur = cur.next;
    }
    cur.next = newNode;
    }
    //delete element from the start of list 
    int deleteFirst(){
        if(head  == null){
            System.out.print("List is empty");
            return -1;   
        }
        int a = head.data;
        head.next = head;
        return a;
    }
    //delete element from the last
    int deleteLast(){
            Node cur = head;
            if(head == null){
               System.out.println("list is empty");
               return -1;
            }
        while(cur.next.next!= null){
            cur = cur.next;
        }
          int d =  cur.data;
          cur.next = null;
          return d;
    }
    //deleting node of given data 
    void deleteGiven(int val){
            Node cur = head;
            if(head == null){
                System.out.println("list is empty ");
                return;
        }
        if(head.data == val){
            head.next = head;
        }
        while(cur.next.data != val){
            cur = cur.next;
        }
        cur.next = cur.next.next;
    }
    //PrintList
    void printList(){
        Node cur = head;
            if(head == null){
               System.out.println("list is empty");
            }
        while(cur!= null){
            System.out.println(cur.data + " ");
            cur = cur.next;
        }
    }
    
    public static void main(String[] args) {
        LinkedListClass ll = new LinkedListClass();
    }
}