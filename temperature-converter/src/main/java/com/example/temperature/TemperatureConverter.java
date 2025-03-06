package com.example.temperature;

/**
 * Класс TemperatureConverter предоставляет методы для конвертации температур
 * между шкалами Цельсия и Фаренгейта.
 */
public class TemperatureConverter {

    /**
     * Преобразует температуру из Цельсия в Фаренгейт.
     * Формула: F = C * 9/5 + 32.
     *
     * @param celsius температура в градусах Цельсия
     * @return температура в градусах Фаренгейта
     */
    public double celsiusToFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32;
    }
    
    /**
     * Преобразует температуру из Фаренгейта в Цельсий.
     * Формула: C = (F - 32) * 5/9.
     *
     * @param fahrenheit температура в градусах Фаренгейта
     * @return температура в градусах Цельсия
     */
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
}
