package org.example.Model;
import java.util.ArrayList;
import java.util.List;

public class Workers {
    protected List<Work> workerList;

    public Workers() {
        this.workerList = generateWorkers();
    }
    public List<Work> generateWorkers() {
        List<Work> workerList = new ArrayList<>();
        workerList.add(new Work("785644", "Петя", 11));
        workerList.add(new Work("444444", "Саша", 15));
        workerList.add(new Work("668899", "Маша", 5));
        return workerList;
    }

    public List<Work> getWorkerList() {
        return workerList;
    }
    public void show(List<Work> workerList) {
        for (Work n : workerList) {
            System.out.println(n);
        }
    }
    public void showNums(List<String> workerList){
        for (String n : workerList) {
            System.out.println(n);
        }
    }
}