package org.example.Controller;
import org.example.Model.NewWorker;
import org.example.Model.Work;

import java.util.ArrayList;
import java.util.List;

public class Sort {
    public Work findById(List<Work> workerList) {
        int idFind = new NewWorker().inputId();
        return workerList.stream().filter(worker -> idFind == worker.getId()).findAny().get();
    }
    public List<String> filterName(List<Work> workerList) {
        String nameFind = new NewWorker().inputName();
        List<String> findWorkers = new ArrayList<>();

        for (Work work : workerList) {
            if (work.getName().equals(nameFind)) {
                findWorkers.add(work.getPhoneNumber());
            }
        }
        return findWorkers;
    }

    public List<Work> filterStage(List<Work> workerList) {
        int stageFind = new NewWorker().inputStage();
        List<Work> findWorkers = new ArrayList<>();

        for (Work work : workerList) {
            if (work.getStage() == stageFind) {
                findWorkers.add(work);
            }
        }
        return findWorkers;
    }
}

