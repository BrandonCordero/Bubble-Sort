public class Node {
  // properties
  private int data;
  private Node next;
// Constructors
  Node(int d) { 
    this.data = d; 
    this.next = null;
    
  }
  public int getData(){
    return this.data;
  }
  
  public Node getNext() {
    return this.next;
  }
  
  public void setData(int newData) {
    this.data = newData;
  }
  
  public void setNext(Node newNext) {
    this.next = newNext;
  }
  //Methods
   public void print() {
    System.out.print(data + " " );
 }
 }