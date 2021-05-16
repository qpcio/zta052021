package Day2;

public class FabrykaSamochodow {
    public static SamochodInt getSamochod(String name){
        SamochodInt samochod;

        switch (name){
            case "Audi":
                samochod = new Audi();
                break;
            case "BMW":
                samochod = new BMW();
                break;
            case "Mercedes":
                samochod = new Mercedes();
                break;
            default:
                samochod = new Maluch();
                break;
        }
        return samochod;
    }


}
