package com.example.temperature;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit-тесты для класса TemperatureConverter.
 */
public class TemperatureConverterTest {
    // Допустимая погрешность для сравнения double значений
    private static final double DELTA = 0.0001;

    /**
     * Тестирование метода celsiusToFahrenheit.
     */
    @Test
    void testCelsiusToFahrenheit() {
        TemperatureConverter converter = new TemperatureConverter();
        
        // Точка замерзания воды: 0°C -> 32°F
        assertEquals(32.0, converter.celsiusToFahrenheit(0), DELTA, "0°C должно быть 32°F");
        
        // Точка кипения воды: 100°C -> 212°F
        assertEquals(212.0, converter.celsiusToFahrenheit(100), DELTA, "100°C должно быть 212°F");
        
        // Тест для отрицательного значения
        assertEquals(14.0, converter.celsiusToFahrenheit(-10), DELTA, "-10°C должно быть 14°F");
    }
    
    /**
     * Тестирование метода fahrenheitToCelsius.
     */
    @Test
    void testFahrenheitToCelsius() {
        TemperatureConverter converter = new TemperatureConverter();
        
        // Точка замерзания воды: 32°F -> 0°C
        assertEquals(0.0, converter.fahrenheitToCelsius(32), DELTA, "32°F должно быть 0°C");
        
        // Точка кипения воды: 212°F -> 100°C
        assertEquals(100.0, converter.fahrenheitToCelsius(212), DELTA, "212°F должно быть 100°C");
        
        // Тест для отрицательного значения
        assertEquals(-23.3333, converter.fahrenheitToCelsius(-10), DELTA, "-10°F должно быть примерно -23.3333°C");
    }
    
    /**
     * Тестирование обратного преобразования (round-trip test).
     */
    @Test
    void testRoundTripConversion() {
        TemperatureConverter converter = new TemperatureConverter();
        double originalCelsius = 25.0;
        double fahrenheit = converter.celsiusToFahrenheit(originalCelsius);
        double convertedCelsius = converter.fahrenheitToCelsius(fahrenheit);
        
        // После преобразования туда и обратно получаем исходное значение
        assertEquals(originalCelsius, convertedCelsius, DELTA, "Обратное преобразование должно вернуть исходное значение");
    }
}
