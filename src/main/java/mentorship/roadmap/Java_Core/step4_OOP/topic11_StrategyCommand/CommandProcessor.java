package mentorship.roadmap.Java_Core.step4_OOP.topic11_StrategyCommand;

import mentorship.roadmap.Java_Core.step4_OOP.topic11_StrategyCommand.commands.Command;
import mentorship.roadmap.Java_Core.step4_OOP.topic11_StrategyCommand.commands.PauseCommand;
import mentorship.roadmap.Java_Core.step4_OOP.topic11_StrategyCommand.commands.StartCommand;
import mentorship.roadmap.Java_Core.step4_OOP.topic11_StrategyCommand.commands.StopCommand;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CommandProcessor {

    private Map<String, Command> commands = new HashMap<>(); //создаем HashMap для хранения команд
    private Scanner sc;

    public CommandProcessor() {
        commands.put("start", new StartCommand()); //регистрируем команду в HashMap, start - здесь ключ, StartCommand создает объект
        commands.put("pause", new PauseCommand());
        commands.put("stop", new StopCommand());
        sc = new Scanner(System.in); //инициализируем сканнер
    }

    public void process() {
        System.out.println("Возможные команды: start, stop, pause");

        while (true) { //бесконечный цикл для постоянного считывания команд из консоли?
            Command command = commands.get(sc.nextLine()); //считываем в переменную строку из консоли и возвращаем команду под аналогичным ключом из HashMap

            if (command != null) {
                command.execute();
            } else {
                System.out.println("Неизвестная команда");
            }
        }
    }
}
