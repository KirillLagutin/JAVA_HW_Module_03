    /*Задание 2
Создать программу по работе со словарем. Например, англо-испанский
или французско-немецкий, или любое другое направление.
Программа должна:
 ■Обеспечивать начальный ввод данных для словаря;
 ■Позволять отобразить слово и его перевод;
*/

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rus, eng;
        int choice;

        TreeSet<MyDictionary> rusEngDictionary = new TreeSet<>(new Comparator<MyDictionary>() {
            @Override
            public int compare(MyDictionary o1, MyDictionary o2) {
                return o1.getRusWord().compareTo(o2.getRusWord());
            }
        });
        rusEngDictionary.add(new MyDictionary("стул", "chair"));

        do {
            System.out.print("Введите 1 чтобы записать слова, или 0 - чтобы закончить: ");
            choice = scanner.nextInt();
            if(choice == 1) {
                System.out.print("Введите русское слово: ");
                rus = scanner.next();
                System.out.print("Введите перевод этого слова: ");
                eng = scanner.next();
                rusEngDictionary.add(new MyDictionary(rus, eng));
            }
        } while (choice != 0);

        MyDictionary search = new MyDictionary();

        System.out.print("Введите искомое русское слово: ");
        search.setRusWord(scanner.next());
        if (rusEngDictionary.contains(search))
            System.out.println(rusEngDictionary.floor(search));
        else System.out.println("Слова [" + search.getRusWord() + "] нет в словаре!");
    }
}

