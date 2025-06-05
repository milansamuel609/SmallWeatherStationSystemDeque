import java.util.*;

class TemperatureMonitor {
    Deque<Integer> deque;
    ArrayList<Integer> temps;

    int k;

    TemperatureMonitor(int k){
        temps = new ArrayList<>();
        this.k = k;
        deque = new ArrayDeque<>();
    }

    void addTemperature(int temp){
        int currentIndex = temps.size();

        // Remove all smaller or equal temperatures from the back
        while (!deque.isEmpty() && temps.get(deque.peekLast()) <= temp){
            deque.removeLast();
        }

        // Remove outdated indices from the front (outside the window)
        while (!deque.isEmpty() && deque.peekFirst() <= currentIndex - k) {
            deque.removeFirst();
        }

        temps.add(temp);
        deque.addLast(currentIndex);
    }

    void getMaxTemperature(){
        if (!deque.isEmpty()){
            System.out.println("Max temperature is: " + temps.get(deque.peekFirst()));
        }
        else {
            System.out.println("Temperature is not valid");
        }
    }
}

public class SmallWeatherStationSystemDeque {
    public static void main(String[] args) {
        TemperatureMonitor monitor = new TemperatureMonitor(3);

        monitor.addTemperature(30);
        monitor.addTemperature(40);
        monitor.addTemperature(60);
        monitor.getMaxTemperature();
        monitor.addTemperature(65);
        monitor.getMaxTemperature();
    }
}
