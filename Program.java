public class Program {

    public static void main(String[] args) {

//        Создаем 2 коробки : для яблок и апельсинов
        Box<Apple> apples = new Box<>();
        Box<Orange> oranges = new Box<>();
//        Наполняем их одинаковым кол-вом фруктов
        for (int i = 0; i < 5; i++) {
            apples.addFruct(new Apple());
            oranges.addFruct(new Orange());
        }
//        Подсчитываем кол-во и выводим в консоль информацию о весе наполненных коробок
        apples.countFructsInBox();
        System.out.printf("Вес коробки %s: %.2f Кг\n", apples.toString(), apples.getWeight());
        System.out.println("|");
        oranges.countFructsInBox();
        System.out.printf("Вес коробки %s: %.2f Кг\n", oranges.toString(), oranges.getWeight());
        System.out.println("|");
        //Сравниваем по весу наши коробки
        apples.compare(oranges);
        System.out.println("|");
//      Создаем третью коробку чтобы в нее пересыпать из нашей коробки
        Box<Orange> box3 = new Box<>();
        for (int i = 0; i < 10; i++) {
            box3.addFruct(new Orange());
        }
        box3.countFructsInBox();
        box3.movingFructs(oranges);
        box3.countFructsInBox();
        System.out.printf("Вес коробки %s: %.2f Кг\n", box3.toString(), box3.getWeight());
        System.out.println("|");
        oranges.countFructsInBox();


    }
    }

