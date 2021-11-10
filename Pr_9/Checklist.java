import java.util.Collections;
import java.util.List;

public class Checklist {

    void addPlanet(List<String> solarSystem, String planet) { // Метод добавления элемента
        solarSystem.add(planet);
    }

    void deletePlanet(List<String> solarSystem, String planet) { // Метод удаления элемента
        solarSystem.remove(planet);
        System.out.println("Удалена планета " + planet);
    }

    void changePlanet(List<String> solarSystem, String planet, String newplanet) { // Метод изменения элемента
        int index = solarSystem.indexOf(planet);
        solarSystem.set(index, newplanet);
        System.out.println("Планета " + planet + " заменена на " + newplanet);
    }

    void swap (List<String> solarSystem) { // Метод перемешивания элементов
        Collections.shuffle(solarSystem);
        System.out.println("Планеты перемешаны!");
    }

    void getRandom (List<String> solarSystem) { // Метод выбора случайного элемента
        int rand = (int)(Math.random()* solarSystem.size());
        System.out.println("Случайная планета: " + (String) solarSystem.get(rand));
    }

    void getIndex (List<String> solarSystem, String planet) { // Метод показа индекса элемента
        int index = solarSystem.indexOf(planet);
        if (index < 0) System.out.println("Планеты нет в списке");
        else System.out.println("Идексом планеты " + (String) solarSystem.get(index) + " является " + index);
    }

    void planetInList (List<String> solarSystem, String planet) { // Метод проверки наличия элемента в списке
        boolean containsElement = solarSystem.contains(planet);
        if (containsElement) System.out.println ("Планета " + planet + " содержится в списке");
        else System.out.println ("Планета " + planet + " не содержится в списке");
    }

    void printSolarSystem (List<String> solarSystem) { // Метод вывода списка на экран
        System.out.println(solarSystem);
    }
}
