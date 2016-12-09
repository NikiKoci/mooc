/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ten;

import java.util.ArrayList;

/**
 *
 * @author Niki
 */
public class ContainerHistory {

    ArrayList<Double> history = new ArrayList<>();

    public ContainerHistory() {
    }

    public void add(double situation) {
        history.add(situation);
    }

    public void reset() {
        history.clear();
    }

    public String toString() {
        return history.toString();
    }

    public double maxValue() {
        double max = Double.MIN_VALUE;
        for (Double double1 : history) {
            if (double1 > max) {
                max = double1;
            }
        }
        return max;
    }

    public double minValue() {
        double min = Double.MAX_VALUE;
        for (Double double1 : history) {
            if (double1 < min) {
                min = double1;
            }
        }
        return min;
    }

    public double average() {
        double sum = 0;
        for (Double double1 : history) {
            sum += double1;
        }
        return sum / history.size();
    }

    public double greatestFluctuation() {
        if (history.size() < 2) {
            return 0;
        }
        double avg = average();
        double max = 0;
        for (int i = 1; i < history.size(); i++) {
            max = Math.max(max, Math.abs(history.get(i-1)-history.get(i)));
        }
        return max;
    }

    public double variance() {
        if (history.size() < 2) {
            return 0;
        } else {
            double sum = 0;
            double avg = average();
            for (Double double1 : history) {
                sum += (double1 - avg) * (double1 - avg);
            }
            return sum / (history.size() - 1);
        }
    }
}
