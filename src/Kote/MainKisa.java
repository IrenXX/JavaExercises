package Kote;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainKisa {
    public static void main(String[] args) {
        List<Kisa> kisas = Kisa.makeKisas(5);
        PrinterKisas.print (kisas);

        System.out.println("Кисы после сортировки");
        System.out.println("**********************************");
        kisas.sort(Comparator.comparingInt(Kisa::getAge));
       // PrinterKisas.print(kisas);


        var cats = new ArrayList<ActiveCats>();
        cats.add(new ActiveCats(ActiveCats.jump()));
        cats.add(new ActiveCats(ActiveCats.eat()));
        cats.add(new ActiveCats(ActiveCats.sleep()));

        cats.forEach(ActiveCats::doAction);
    }
}
