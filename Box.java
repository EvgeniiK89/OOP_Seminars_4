import java.util.ArrayList;

public class Box <T extends Fruct>{

    private static int count = 0;

    private int boxNumber = ++count;

    //c. Для хранения фруктов внутри коробки можно использовать ArrayList;
    private ArrayList<T> fructs = new ArrayList<>();

    //d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
    public double getWeight(){
        double sum = 0;
        for (T fruct: fructs){
            sum = sum + fruct.getWeight();
        }
        return sum;
    }

//    e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
//    подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
//    Можно сравнивать коробки с яблоками и апельсинами;
    public boolean compare(Box<? extends Fruct> box){
        if (this.getWeight() == box.getWeight()){
            System.out.println("Вес коробок одинаковый");
            return true;
        } else if (this.getWeight() > box.getWeight()){
            System.out.printf("Коробка %s тяжелее чем коробка %s\n", this.toString(), box.toString());
            return false;
        } else {
            System.out.printf("Коробка %s тяжелее чем коробка %s\n",box.toString(),this.toString());
            return false;
        }
    }

//    f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
//    Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
//    Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
    public void movingFructs(Box<T> box){
        this.fructs.addAll(box.fructs);
        box.fructs.clear();
        System.out.println("Фрукты пересыпали из коробки " + box.toString() + " в коробку " + this.toString());
    }

    public void countFructsInBox(){
        System.out.printf("В коробке %s: %d фрукта/ов\n", this.toString(), fructs.size());
    }

    //    g. Не забываем про метод добавления фрукта в коробку.
    public void addFruct(T fruсt){
        fructs.add(fruсt);
    }

    @Override
    public String toString() {
        return "№" + boxNumber;
    }
}
