// TODO: 11.02.2023
//  Реализовать readFile(). Логика проста...
//  Вытащить данные из текстового файла и записать их к объекту класса City.
//  Небольшая подсказказка можно использовать метод .split() класса String.

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

// TODO: 11.02.2023
//  После того как ты закончил предыдущий метод можешь приступить к следуещему.
//  Вся суть printAllCities() заключается в том, что надо вывести все города на консоль.
public class CityMethodsImpl implements CityMethods {


    @Override
    public City[] readFile() {
        return new City[0];
    }

    @Override
    public void printAllCities(City[] cities) {

    }

    @Override
    public void groupByRegion(City[] cities) {

    }

    @Override
    public void searchByName(String name) {

    }
}
