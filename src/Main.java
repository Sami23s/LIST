public class Main {
    public static void main(String[] args) {
        MujList lst=new MujList(new Element(0));
        lst.vloz(5);
        lst.vloz(9);
        lst.vloz(2);
        lst.vloz(0);
        lst.vloz(1);
        lst.vloz(5);
        lst.vloz(7);


        System.out.println("POVODNE: ");
        lst.print();
        System.out.println("------------------");

        System.out.println("REVERZNE: ");
        Element reversed = lst.reverse(lst.first);
        MujList reversedList = new MujList(reversed);
        reversedList.print();



       // lst.printRR();

    }
}