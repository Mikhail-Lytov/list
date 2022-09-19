public class test_list {
    public static void main(String[] args){
    myList list = new myList();
    list.set_begin_element_mylist(5);
    list.set_end_element_myList("privet");
    list.set_begin_element_mylist(4);
    myList copy = new myList<>();
    copy.copy_list(list,copy);
    //System.out.println(list.size_list());
    //list.delete_begin_elemetn_mylist();
    //list.delete_end_elemetn_mylist();
        //list.delete_by_value("privet");
    //list.clear_mylist();
    copy.print_mylist();
    }
}
