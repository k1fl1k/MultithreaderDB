package com.k1fl1k.multithreder.service;

import com.k1fl1k.multithreder.model.entities.Worker;
import java.util.ArrayList;
import java.util.List;

public class WorkerSearch {
    public static int countWorkersWithEducation(List<Worker> workers, String targetEducation) {
        int count = 0;
        for (Worker worker : workers) {
            if (worker.getEducation().equals(targetEducation)) {
                count++;
            }
        }
        return count;
    }

    public static List<Worker> findWorkersWithEducation(List<Worker> workers, String targetEducation) {
        List<Worker> matchingWorkers = new ArrayList<>();
        for (Worker worker : workers) {
            if (worker.getEducation().equals(targetEducation)) {
                matchingWorkers.add(worker);
            }
        }
        return matchingWorkers;
    }
}
