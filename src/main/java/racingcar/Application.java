package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        System.out.printf("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)\n");
        String[] cars = Console.readLine().split(",");

        for(String car: cars){
            if (car.length()>5){
                throw new IllegalArgumentException();
            }
        }

    }
}
