package Singleton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public enum CarsAvailability {
    Cars;
    private Map<String, Boolean> cars = new HashMap<>();

    public void putCarOrSetIsCarAvailable(String id, boolean isAvailable){
        cars.put(id, isAvailable);
    }

    public List<String> getAvailableCarsIds() {
        List<String> carsIds = new ArrayList<>();
        for(Map.Entry<String, Boolean> item : cars.entrySet()){
            if(item.getValue()){
                carsIds.add(item.getKey());
            }
        }
        return carsIds;
    }

    public boolean getIsCarAvailable(String id) {
        return cars.get(id);
    }

}
