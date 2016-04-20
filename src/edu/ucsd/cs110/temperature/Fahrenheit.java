package edu.ucsd.cs110.temperature;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Fahrenheit extends Temperature {
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float temp = super.getValue();
        temp -= 32;
        temp *= 5;
        temp = temp/9;

        return new Fahrenheit(temp);
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit(super.getValue());
    }


    public String toString()
    {
        return ""+super.getValue()+" F";
    }
}

