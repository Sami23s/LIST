import java.util.*;

public class MujList {
    public Element first;

    private Element last;


    public MujList(Element element) {
        this.last=element;

        this.first = element;


    }

    public void vloz(int d) { // pridava na zaciatok zoznamu a dalej posuva
        Element e = new Element(d);
        if (first == null) { // tato podmienka neprebehne kedze som fixne v konstruktore nstavil )
            first = e;
        } else {
            e.setNext(first);
            first = e;
        }
        if (last!=null){ //pridana podmienka na nastavenie posledneho
            e.setPrev(last);
        }


    last=e;
}

  /*  private void najvac(Element naj){
        naj=first;
        if (Arrays.equals()){

        }
    }*/

    private void printw(Element aktualny) { //print list povodne
        if (aktualny == null) {
            return;
        }
        printw(aktualny.getNext());
        System.out.print(aktualny.getData() + " ");

    }
    public void print() {
        printw(first);
        System.out.println();
    }

    Element reverse(Element el) { //reverznuty list aj v pamati
        Element prev = null;
        Element current = el;
        Element next = null;
        while (current != null) {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        el = prev;
        return el;

    }
    public void randomize() {
        List<Integer> list = new ArrayList<>();
        Element current = first;
        while (current != null) {
            list.add(current.getData());
            current = current.getNext();
        }

        Collections.shuffle(list);

        current = first;
        for (int i = 0; i < list.size(); i++) {
            current.setData(list.get(i));
            current = current.getNext();

        }

    }



 }
   /* public void printR(Element aktual){ //list rekurzivne
       if(aktual==null) {
           return;
       }
        System.out.print(aktual.getData() + " ");
        printR(aktual.getPrev());

        }

    public void printRR() {
        printR(last);
        System.out.println();
    }}*/




