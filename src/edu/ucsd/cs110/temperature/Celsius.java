package edu.ucsd.cs110.temperature;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Celsius extends Temperature {

    public Celsius(float t)
        {
            super(t);
        }

    @Override
    public Temperature toCelsius() {
        return new Celsius(super.getValue());
    }

    @Override
    public Temperature toFahrenheit() {
        float temp = super.getValue();
        temp *= 1.8;
        temp += 32;

        return new Fahrenheit(temp);
    }


    public String toString()
        {
            return ""+super.getValue()+" C";
        }
}
