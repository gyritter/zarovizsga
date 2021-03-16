package hu.nive.ujratervezes.zarovizsga.workhours;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class WorkHours {

    private List<WorkersWorked> workersList=new ArrayList<>();

    public String minWork(String file) {
        WorkersWorked result=null;
        readFile(file);
        int min=24;
        for(WorkersWorked w:workersList){
            if (w.getHours()<min){
                result=w;
                min=w.getHours();
            }
        }
        return result.getName() + ": " +result.getDate();
    }

    private void readFile(String file) {

        try (BufferedReader reader = Files.newBufferedReader(Path.of(file))) {
            readLines(reader);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public void readLines(BufferedReader reader) throws IOException {
        String line;
        while ((line = reader.readLine()) != null) {
            addWorkersToList(line);
        }
    }
    public void addWorkersToList(String line){
        String[] div=line.split(",");
        workersList.add(new WorkersWorked(div[0],Integer.parseInt(div[1]), div[2]));
    }
}
