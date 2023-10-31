package controller;

import camp.nextstep.edu.missionutils.Console;
import model.Car;
import model.Race;
import model.RacingCar;
import view.InputView;
import view.OutputView;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RacingController {
    static InputView inputView = new InputView();
    static OutputView outputView = new OutputView();

    public static void init(){
        inputView.createCar();

        ArrayList<Car> carArrayList = Stream
                .of(Console.readLine().split(","))
                .map(name -> new RacingCar(name))
                .collect(Collectors.toCollection(() -> new ArrayList<>()));

        int laps = inputView.inputLaps();
        Race race = new Race(laps, carArrayList);
        startRace(race);
    }

    public static void startRace(Race race){
        outputView.printResult();
        for(int i =0; i<race.getLaps();i++){
            race.startDrive();
            race.getCarArrayList().forEach(car -> outputView.printPosition(car));
        }
    }

    public static void endRace(Race race){
        ArrayList winner = race.CheckWinner();

    }
}
