package Leetcode;

import java.util.ArrayList;
import java.util.Random;

public class TrainW {
    /*Значит, идея такая, что нам нужно включить свет в начальном вагоне, в котором мы находимся, если он ещё не горит.
     Затем пойти в одну любую сторону до тех пор, пока не встретим там вагон с работающим освещением, при этом
     считаем пройденные вагоны. Выключаем в найденном вагоне свет и идём обратно к начальному. Если в нём свет всё ещё
      горит, то повторяем операцию. Если же нет, значит мы прошли полный круг и уже знаем ответ!*/
    public static void main(String[] args) {
        Human human = new Human();
        human.countCarriages();
    }

    public static class Train {
        private final Random random = new Random();
        private Carriage head;//это первый поезд
        private Carriage tail;//это последний поезд
        public final int countOfCarriages = random.nextInt(1, 1000);//это сколько в нем будет вагонов

        private final ArrayList<Carriage> train = new ArrayList<>();//это наш поезд

        //тут мы заполняем поезд с рандомно включенным светом
        public ArrayList<Carriage> makeTrain() {
            for (int i = 0; i < countOfCarriages; i++) {
                train.add(addCarriage(random.nextBoolean()));
            }
            return train;
        }

        //метод возвращающий рандомную позицию человека в поезде
        public int randomPosition() {
            return random.nextInt(1, countOfCarriages);
        }

        //этот метод нужен для сцепления вагонов, при добавлении нового
        private Carriage addCarriage(boolean value) {
            Carriage newNode = new Carriage(value);
            if (train.size() == 0) {
                head = newNode;
            } else {
                newNode.nextCarriage = head;
                newNode.previousCarriage = tail;
                head.previousCarriage = newNode;
                tail.nextCarriage = newNode;
            }
            tail = newNode;
            return newNode;
        }

    }

    public static class Human {
        private final Train train = new Train();
        private final ArrayList<Carriage> randomTrain = train.makeTrain();
        private final Carriage head = randomTrain.get(train.randomPosition());

        //метод обхода по вагонам и подсчета их количества
        public void countCarriages() {
            int count = 0;
            boolean end = true;
            //если свет в вагоне выключен мы его включаем
            if (!head.value) {
                head.value = true;
            }
            //Завожу переменную текущий вагон, чтобы итерироваться по поезду
            Carriage currentCarriage = head;
            System.out.println("Сколько вагонов в составе: " + train.countOfCarriages);
            do {
                currentCarriage = currentCarriage.nextCarriage;//текущим вагоном становится следующий вагон
                count++;
                if (currentCarriage.value) {// если свет включен, выключаем его
                    currentCarriage.value = false;
                    for (int i = count; i > 0; i--) {// и идем обратно
                        currentCarriage = currentCarriage.previousCarriage;
                    }
                    if (!currentCarriage.value) {
                        System.out.println("Сколько вагонов насчиталось: " + count);
                        end = false;
                    } else {
                        count = 0;
                    }//сбрасываем счетчик

                }
            } while (end);//делаем до тех пор, пока голова поезда не выключится

        }

    }

    //Класс вагон
    public static class Carriage {
        boolean value;//значение света внутри вагона
        Carriage nextCarriage;//переменная которая будет указывать на следующий узел
        Carriage previousCarriage;//переменная которая будет указывать на предыдущий узел

        public Carriage(boolean value) {
            this.value = value;
            this.nextCarriage = this;
            this.previousCarriage = this;

        }
    }
}

