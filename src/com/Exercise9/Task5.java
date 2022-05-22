package com.Exercise9;

enum TrafficLights{
    RED,YELLOW,GREEN
}
class Simulator{
    TrafficLights color = TrafficLights.RED;

    public void change(){
        switch (color){
            case RED:
                color = TrafficLights.GREEN;
                break;
            case YELLOW:
                color = TrafficLights.RED;
                break;
            case GREEN:
                color = TrafficLights.YELLOW;
                break;
        }
    }
    public String toString(){
        return "It is "+color;
    }
}
public class Task5 {
    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        for (int i=0;i<9;i++){
            System.out.println(simulator);
            simulator.change();
        }
    }
}
