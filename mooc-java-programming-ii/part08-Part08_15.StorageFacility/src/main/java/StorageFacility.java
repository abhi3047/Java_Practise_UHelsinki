import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storageUnits;

    public StorageFacility(){
        this.storageUnits=new HashMap<>();
    }

    public void add(String unit, String item){
        this.storageUnits.putIfAbsent(unit,new ArrayList<>());
        this.storageUnits.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit){
        if (this.storageUnits.containsKey(storageUnit)){
            return storageUnits.get(storageUnit);
        }
        return new ArrayList<>();
    }

    public void remove(String storageUnit, String item){
        if (storageUnits.containsKey(storageUnit)){
            storageUnits.get(storageUnit).remove(item);
        }

    }

    public ArrayList<String> storageUnits(){
        ArrayList<String> unitNames=new ArrayList<>();

        for(String name:storageUnits.keySet()){
            int arraySize=storageUnits.get(name).size();
            if (arraySize>0){
                unitNames.add(name);
            }
        }
        return unitNames;
    }





}



