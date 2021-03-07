
/**
 * Created by LAB on 2/22/2021.
 */
public class SinglyLinkedList<E> {
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;
    public boolean isEmpty() {
        return size == 0;
    }
    public E first() {
        if (isEmpty()) return null;
        return head.getElement(); }
    public E last() {
        if (isEmpty()) return null;
        return tail.getElement(); }
    public void addFirst(E element) {
        head = new Node<E>(element, head);
        if (size == 0)
            tail = head;
        size++; }
    public void addLast(E element){
        Node<E> newest = new Node<E>(element,null);
        if(isEmpty()){
            head = newest; }
        else{
            tail.setNext(newest); }
        tail = newest;
        size++; }
    public E removeFirst(){
        if (isEmpty())return null;
        E deleted = head.getElement();
        head = head.getNext();
        size--;//concatenating
        if(size == 0)
            tail = null;
        return deleted; }
    public String print(){
        Node<E> i = head;
        String all = "";
        while (i != null)
        { all = all + i.getElement().toString() + "\n";
            i = i.getNext(); }
        return all; }
    // Question.R-3.6
    public String findingSecondToLast(){
        Node<E> cur = head.next; // get the second node.
        String element = "";
        while (cur != null){
            element += cur.getElement().toString() + "\n";
            cur = cur.getNext(); }
        return element; }
    // Question.R-3.9
    public int size() {
        Node<E> cur = head; // get the first node in the link-List.
        int currentSize;
        for (currentSize = 0; cur != null; cur = cur.next) {
            currentSize++; }
        return currentSize; }
    // Question.R-3.12
    public void rotate(){
        SinglyLinkedList<E> rota = new SinglyLinkedList<>();
        int i = size;
        while (i != size / 2){
            rota.addFirst(removeFirst());
            i--; }
        head = rota.head; }
    // Question.C-3.25
    public SinglyLinkedList<E> concatenating(SinglyLinkedList<E> m, SinglyLinkedList<E> l){
        SinglyLinkedList<E> margeList = new SinglyLinkedList<>();
        Node<E> first = m.head;
        Node<E> second = l.head;
        while (second != null){
            if (first != null ){
                Node<E> curNode = first;
                margeList.addLast(curNode.element);
                first = curNode.next;
            }else {
                margeList.addLast(second.element);
                second = second.next; } }
        return margeList; }
    // Question.C-3.28
    public void reverse(){
        SinglyLinkedList<E> re = new SinglyLinkedList<>();
        int i = size;
        while (size != 0){
           re.addFirst(removeFirst());
           i--; }
        head = re.head; }
    private static class Node<E> {
        private E element;
        private Node<E> next;
        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next; }
        public E getElement() {
            return element;
        }
        public void setElement(E element) {
            this.element = element;
        }
        public Node<E> getNext() {
            return next;
        }
        public void setNext(Node<E> next) {
            this.next = next;
        }}}












