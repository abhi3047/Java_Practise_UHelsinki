import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate,String> owners;

    public VehicleRegistry(){
        this.owners=new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner){
        if (owners.containsKey(licensePlate)){
            return false;
        }
        owners.put(licensePlate,owner);
        return true;
    }

    public String get(LicensePlate licensePlate){
        String ownerName="";
        if(owners.containsKey(licensePlate)){
            ownerName=owners.get(licensePlate);
            return ownerName;
        }else {
            return null;
        }


    }

    public boolean remove(LicensePlate licensePlate){
        if (owners.containsKey(licensePlate)){
            owners.remove(licensePlate);
            return true;

        }
        return false;

    }

    public void printLicensePlates(){
        for(LicensePlate licensePlate:owners.keySet()){
            System.out.println(licensePlate);
        }
    }

    public void printOwners(){
        ArrayList<String> ownersList=new ArrayList<>();
        for(String name:owners.values()){
            if(!(ownersList.contains(name))){
                ownersList.add(name);
            }
        }
        for(String name:ownersList){
            System.out.println(name);
        }

    }

}
