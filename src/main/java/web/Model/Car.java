package web.Model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private long id;
    private String marka;
    private String model;


    public Car(int id, String marka, String model) {
        this.id = id;
        this.marka = marka;
        this.model = model;
    }

    public long getId() {
        return id;
    }


    public String getMarka() {
        return marka;
    }


    public String getModel() {
        return model;
    }


    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}