package view;

import model.Car;
import model.Race;

import java.util.ArrayList;

public class OutputView {
    public void printPosition(Car car){
        System.out.printf("%s : ", car.getName());
        for(int i = 0; i<car.getPosition(); i++){
            System.out.printf("-");
        }
        System.out.printf("\n");
    }

    public void printResult(){
        System.out.printf("실행 결과\n");
    }

    public void printWinner(ArrayList winner){
        System.out.printf("최종 우승자 : ");

    }
}
