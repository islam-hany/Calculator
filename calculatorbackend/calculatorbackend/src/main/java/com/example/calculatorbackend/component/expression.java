package com.example.calculatorbackend.component;

public class expression {
    private float x;
    private float y;
    private char operator;
    private float result;

    public expression(float x, float y, char operator) {
        this.x = x;
        this.y = y;
        this.operator = operator;
        this.result = 0;
    }

    public float getResult()
    {
        switch(operator) {
            case '+':
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '*':
                result = x * y;
                break;
            case '/':
                result = x / y;
                break;
            case '%':
                result = x % y;
                break;
            case 'p':
                result = (float) Math.pow(x,2);
                break;
            case 's':
                result = (float) Math.sqrt(x);
                break;
            case 'o':
                result = 1/x;
                break;
        }

        return result;
    }
}
