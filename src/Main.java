//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int calculateTotalProductionCapacity(int[] machineCapacities) {
        int totalCapacity = 0;
        for (int capacity : machineCapacities) {
            totalCapacity += capacity;
        }
        return totalCapacity;
    }

    // Функция для определения средней производительности на одного работника
    public static double calculateAverageWorkerProductivity(int totalProduction, int totalWorkers) {
        if (totalWorkers == 0) {
            return 0;
        }
        return (double) totalProduction / totalWorkers;
    }

    // Функция для определения наличия неисправных машин на заводе
    public static boolean hasBrokenMachines(boolean[] machineStatus) {
        for (boolean status : machineStatus) {
            if (!status) {
                return true; // Если есть хотя бы одна неисправная машина, возвращаем true
            }
        }
        return false; // Если все машины работают исправно, возвращаем false
    }

    // Пример использования:
    public static void main(String[] args) {
        int[] machineCapacities = {100, 150, 200, 80};
        int totalCapacity = calculateTotalProductionCapacity(machineCapacities);
        System.out.println("Общая производственная мощность: " + totalCapacity);

        int totalWorkers = 50;
        double averageProductivity = calculateAverageWorkerProductivity(totalCapacity, totalWorkers);
        System.out.println("Средняя производительность на одного работника: " + averageProductivity);

        boolean[] machineStatus = {true, true, false, true};
        boolean hasBroken = hasBrokenMachines(machineStatus);
        System.out.println("Есть ли неисправные машины на заводе? " + (hasBroken ? "Да" : "Нет"));
    }


}