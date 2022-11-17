package ThucHanhTrienKhaiListDonGian;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInterger = new MyList<Integer>();
        listInterger.add(1);
        listInterger.add(2);
        listInterger.add(3);
        listInterger.add(3);
        listInterger.add(4);
        listInterger.add(5);
        listInterger.add(6);
        listInterger.add(7);
        listInterger.add(8);
        listInterger.add(9);
        listInterger.add(10);
        listInterger.add(11);
        listInterger.add(12);
        listInterger.add(13);

        System.out.println("element 4:" + listInterger.get(4));
        System.out.println("element 1:" + listInterger.get(1));
        System.out.println("element 2:" + listInterger.get(2));



        listInterger.get(13);
        System.out.println("element 13: "  + listInterger.get(13));
    }
}
