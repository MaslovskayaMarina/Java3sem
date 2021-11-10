import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Checklist SolarSystem = new Checklist();

        List<String> solarSystem = new ArrayList<>();
        SolarSystem.addPlanet(solarSystem, "Меркурий"); // Тест метода добавления элементов
        SolarSystem.addPlanet(solarSystem, "Венера");
        SolarSystem.addPlanet(solarSystem,"Земля");
        SolarSystem.addPlanet(solarSystem,"Марс");
        SolarSystem.addPlanet(solarSystem,"Юпитер");
        SolarSystem.printSolarSystem(solarSystem); // Вывод на экран
        SolarSystem.deletePlanet(solarSystem,"Венера"); // Тест удаления элемента из списка
        SolarSystem.printSolarSystem(solarSystem); // Вывод на экран
        SolarSystem.changePlanet(solarSystem,"Марс","Нептун"); // Тест измнения элемента
        SolarSystem.printSolarSystem(solarSystem); // Вывод на экран
        SolarSystem.swap(solarSystem); // Тест перемешивания элементов
        SolarSystem.printSolarSystem(solarSystem); // Вывод на экран
        SolarSystem.getRandom(solarSystem); // Тест выбора случайной планеты
        SolarSystem.getRandom(solarSystem);
        SolarSystem.getRandom(solarSystem);
        SolarSystem.printSolarSystem(solarSystem); // Вывод на экран
        SolarSystem.getIndex(solarSystem,"Меркурий"); // Тест показа индекса элемента
        SolarSystem.getIndex(solarSystem,"Земля");
        SolarSystem.planetInList(solarSystem,"Нептун"); // Тест наличия элемента в списке
        SolarSystem.planetInList(solarSystem,"Венера");
        Collections.fill(solarSystem, "Уран"); // Заменяет все элементы списка указанным элементом
        SolarSystem.printSolarSystem(solarSystem);
        Collections.addAll(solarSystem, "Нептун", "Земля", "Марс", "Венера"); // Добавляет все указанные элементы в указанную коллекцию.
        SolarSystem.printSolarSystem(solarSystem);

        List<String> unmodSolarSystem = Collections.unmodifiableList(new ArrayList<>(Arrays.asList("Меркурий", "Венера", "Земля", "Марс", "Юпитер")));
//      unmodSolarSystem.add("Меркурий"); Так как список является немодифицируемым, то добавлять элементы нельзя
        SolarSystem.printSolarSystem(unmodSolarSystem);
        SolarSystem.getRandom(unmodSolarSystem);
        SolarSystem.planetInList(unmodSolarSystem, "Меркурий");
        SolarSystem.planetInList(unmodSolarSystem, "Уран");
        SolarSystem.getIndex(unmodSolarSystem, "Меркурий");
        SolarSystem.getIndex(unmodSolarSystem, "Уран");
    }
}
