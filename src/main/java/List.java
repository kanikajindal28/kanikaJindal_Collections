import java.util.ArrayList;

public class List {

    ArrayList<Integer> list = new ArrayList();

    void add(int element) {
        list.add(element);
    }
    int get(int position) {

        return list.get(position);
    }
    int getIndex(int element) {

        return list.indexOf(element);
    }
    void remove(int position) {

        list.remove(list.get(position));
    }
    void removeLast() {
        list.remove(list.get(list.size()-1));
    }
    void removeFirst() {

        list.remove(list.get(0));
    }
    void print() {
        System.out.print(list);
        System.out.println();
    }

}
