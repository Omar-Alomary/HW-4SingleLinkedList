/**
 * Created by LAB on 2/22/2021.
 */
public class TestSingly {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        SinglyLinkedList<Integer> list2 = new SinglyLinkedList<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        System.out.println(list.print());
        list.reverse();
        System.out.println(list.print());
//        System.out.println("From second - Last:");
//        System.out.println(list.findingSecondToLast());
      //  list.rotate();
      //  System.out.println(list.concatenating(list,list2).print());
        //System.out.println(list.print());
       // System.out.println("Size = " + list.size());













        // SinglyLinkedList s = list.concatenating(list,list2);
       // list.reverse();
       // list.rotate();
       // System.out.println(list.size());

//        System.out.println(list.print());
//        System.out.println(list2.print());
//
//        int n = list.size();
//        for (int i = 0; i < n; i++) {
//            String x = list.removeFirst();
//            list2.addFirst(x);
//            System.out.println(x);
//
//        }
//        System.out.println(list.size());
//        System.out.println(list2.size());
    }
}
