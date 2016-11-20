public class List
{
  // properties
  Node head;

  // Constructors
  List() { 
    this.head = null;
    
 }
  
  // getters & setters
  public Node getHead() {
    return this.head;
  }

  public void setHead(Node newHead) {
    this.head = newHead;
  }
  // Methods
  // Adds node to the head of the list
  public void addData(int newInt) {
    Node newNode = new Node(newInt);
    
    // if list is empty, 
    //add data to new head node
    if (this.isEmpty()) {
      this.head = newNode;
    }
    else 
    {
    Node current = this.head.getNext();
    Node prev = this.head;
    while(current != null)
    {
     
    prev = prev.getNext();
    current = current.getNext();
   
      
      //newNode.setNext(head);
      //head = newNode;
    }
    prev.setNext(newNode);
  }
  }
  public Node get(int index)
  {
    Node current = this.head;
    int num = 0;
    while(current != null)
    {
      if ( num == index)
        break;
      
    num ++;
    current = current.getNext();
    }
    return current;
  }
  public void bubbleSort(){
    
    
    
  }
  
  public boolean isEmpty() {
    // tests if the list is empty
    return this.head == null;
  }
  
  
 
  
  public void print() {
    // local Node variable to keep track of where we are
    // start at the head of the list
    Node current = this.head;
    // loop through until we get to end of list
    while(current != null) {
      current.print(); // print current node
      // move current to the next node
      current = current.getNext();
    }
    System.out.println("");
  }  
  
}