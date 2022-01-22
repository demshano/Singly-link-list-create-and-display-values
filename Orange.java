import java.util.List;

public class Orange  {

        private ListNode head;                  //create listnode head

        public static class ListNode{           //create listnode class

                private int data;               //initial the data of the node
                private ListNode next;          //initial the next of node

                public ListNode(int data){      // create a listnode constructor and hold node values
                        this.data = data;
                        this.next=null;         //initially head node has value and next is null
                }
        }

    
        public static void main(String[] args) {

                Orange obj = new Orange();       //create a object  

               obj.head = new ListNode(10);             //push the values to the head node
                ListNode second = new ListNode(20);     //push the value to second node
                ListNode third = new ListNode(30);      //push the value to third node
                ListNode forth = new ListNode(40);      //push the value to forth node
                ListNode fifth = new ListNode(50);      //push the value to fifth node

                //now link all the node together like a chain

obj .head.next = second;                       // 10-->20                     
second.next=third;                             //10-->20-->30
third.next=forth;                              //10-->20-->30-->40
forth.next=fifth;                              //10-->20-->30-->40-->50-->null
                
obj.display();                  //call the display function
System.out.print(obj.countnode());               //call the countnode function
  
}

public  void display(){                 //to get the node values output we have to travers the node chain
        ListNode current = head;        //create a tempory node call current
        while(current!=null){           // travers untill the node next is null
                System.out.println(current.data);
                current=current.next;

        }
}
      public int countnode(){
              
              ListNode current = head;
              int count=0;
              while(current!=null){
                      count++;
                      current=current.next;
                      return count;
              }

}


    

