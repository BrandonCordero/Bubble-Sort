public class main {
  public static void main (String [] args) {
 
    List myList = new List();
    
    // test
     myList.addData(3);
     myList.addData(9);
     myList.addData(12);
     myList.addData(2);
     myList.addData(8);
     
     myList.print();
     myList.bubbleSort();
     myList.print();
  }
}