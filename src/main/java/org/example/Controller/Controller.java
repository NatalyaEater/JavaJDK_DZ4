package org.example.Controller;

import org.example.Model.Work;
import org.example.Model.Workers;
import org.example.Model.NewWorker;
import org.example.View.Menu;

import java.util.List;

public class Controller {
    List<Work> findWorker;
    List<String> findWorkerNum;
    public void button(){
        Workers workers = new Workers();

        boolean exit = false;

        while (exit == false){
            switch (new Menu().switchMenu()) {
                case "1" -> {
                    new NewWorker().newWorker(workers.getWorkerList());
                    new Workers().show(workers.getWorkerList());
                }
                case "2" -> {
                    findWorker = new Sort().filterStage(workers.getWorkerList());
                    new Workers().show(findWorker);
                }
                case "3" -> {
                    findWorkerNum =new Sort().filterName(workers.getWorkerList());
                    new Workers().showNums(findWorkerNum);
                }
                case "4" -> System.out.println(new Sort().findById(workers.getWorkerList()));
                case "5" -> new Workers().show(workers.getWorkerList());
                case "6" -> exit = true;
            }
        }

    }
}
