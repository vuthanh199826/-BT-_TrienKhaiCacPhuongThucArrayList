public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<Integer>();
        list.add(0,0);
        list.add(1,1);
        list.add(2,2);
        list.remove(2);
        System.out.println(list.size());
        list.contains(1);
        list.indexOf(0);
        list.ensureCap(5);
        list.get(2);
    }
}
