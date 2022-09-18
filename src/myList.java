import org.w3c.dom.Node;

public class myList<E> {
    private Node<E> first_element;
    private Node<E> last_element;
    private int number_elements = 0;

    public myList(){
        last_element = new Node<E>(null, first_element,null);
        first_element = new Node<E>(null,null, last_element);
    }
    public void set_end_element_myList(E element){
        Node<E> prev = last_element;
        prev.setItem(element);
        last_element = new Node<E>(null,prev,null);
        prev.setNext(last_element);
        number_elements++;
    }
    public void set_begin_element_mylist(E element){
        Node<E> next = first_element;
        next.setItem(element);
        first_element = new Node<E>(null,null,next);
        next.setNext(first_element);
        number_elements++;
    }

    public void print_mylist(){
        Node<E> perem = first_element;
        for(int i =0; i < number_elements - 1; i++){
            System.out.println(perem.getItem());
            perem = perem.getNext();

        }
    }
    public int size_list(){
        return number_elements;
    }
    public void delete_begin_elemetn_mylist(){
        first_element = first_element.getNext();
        first_element.setItem(null);
        first_element.setPrev(null);
        number_elements--;
    }

    private static class Node<E>{
        E item;
        Node<E> next;
        Node<E> prev;
        private Node(E item,Node<E> prev, Node<E> next){ // данный, предыдущий, следующий
            this.item = item;
            this.next = next;
            this.prev = prev;

        }
        public E getItem(){
            return item;
        }
        public void setItem(E item){
            this.item =item;
        }
        public Node<E> getNext(){
            return next;
        }
        public void setNext(Node<E> next){
            this.next = next;
        }
        public void setPrev(Node<E> prev){
            this.prev =prev;
        }
        public Node<E> getPrev(){
            return prev;
        }
    }

}
