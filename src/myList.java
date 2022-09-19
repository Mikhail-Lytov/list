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
        next.setPrev(first_element);
        number_elements++;
    }

    public void print_mylist(){
        Node<E> variable = first_element;
        for(int i =0; i < number_elements; i++){
            variable = variable.getNext();
            E lox = variable.getItem();
            System.out.println(variable.getItem());

        }
    }
    public void copy_list(myList original, myList copy){ // мы взяли весь список
        Node<E> original_element = original.first_element;
        E item = null;
        Node<E> copy_element = copy.last_element;
        //Node<E> next_element_copy;
        for (int i = 0; i < original.number_elements; i++){
            original_element = original_element.getNext();
            item = original_element.getItem();
            copy_element.setItem(item);
            copy.last_element = new Node<E>(null,copy_element,null);
            copy_element.setNext(copy.last_element);
            copy_element = copy.last_element;

            //copy.first_element = new Node<E>(null,null,copy_element);
            //copy_element.setPrev(first_element);
            //copy_element =
            copy.number_elements++;
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
    public void delete_end_elemetn_mylist(){
        last_element = last_element.getPrev();
        last_element.setItem(null);
        last_element.setNext(null);
        number_elements--;
    }
    public void delete_by_value(E element){
        Node<E> previous = first_element;
        Node<E> current = first_element.getNext();
        Node<E> next = current.getNext();
        for(int i =0; i < number_elements; i++){
            E item = current.getItem();
            if(item == element){
                previous.setNext(next);
                next.setPrev(previous);
                number_elements --;
                break;
            }
            previous = previous.getNext();
            current = previous.getNext();
            next = current.getNext();
        }
    }
    public void clear_mylist(){
        Node<E> variable = first_element;
       last_element.setPrev(first_element);
       first_element.setNext(last_element);
       number_elements = 0;
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
    public int getSize(){
        return number_elements;
    }

}
