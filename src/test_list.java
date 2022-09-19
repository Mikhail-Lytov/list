public class test_list {
    public static void main(String[] args){
        myList list = new myList<>();//создание списка
        list.set_begin_element_mylist("Lytov");//добавим элемент в начало
        list.set_begin_element_mylist("Misha");//добавим элемент в начало
        list.set_end_element_myList("ККСО-03-20"); // добавим элемент в конец
        list.set_begin_element_mylist("13"); // добавим элемент в начало
        list.print_mylist();//распечатаем список
        myList copy = new myList<>();//создадим ещё один список
        copy.copy_list(list,copy);//скопировали один список в другой
        System.out.println("копия данных");
        copy.print_mylist();
        copy.delete_begin_elemetn_mylist();
        System.out.println("удалили в начале списка: ");
        copy.print_mylist();
        copy.delete_end_elemetn_mylist();
        System.out.println("удалили в конце списка: ");
        copy.print_mylist();
        list.delete_by_value("Misha"); // удаление по значению
        System.out.println("что осталось после поэлементного удаление");
        list.print_mylist();
         int size = list.size_list();
        System.out.println("сколько там элементов: " + size);
        list.print_mylist();
        System.out.println("удалим список");
        list.clear_mylist();
        size= list.getSize();
        System.out.print("осталось данных: " + size);


    }
}
