package hu.nive.ujratervezes.zarovizsga.dogtypes;

import javax.sql.DataSource;
import java.text.Collator;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class DogTypes {

    private DataSource dataSource;

    public DogTypes(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> getDogsByCountry(String country){
        DogTypesDao dogTypesDao=new DogTypesDao();
        List<String> result = dogTypesDao.selectDogsByCountry(dataSource,country);
        Collections.sort(result, Collator.getInstance(new Locale("hu", "HU")));
        return result;
    }
}
