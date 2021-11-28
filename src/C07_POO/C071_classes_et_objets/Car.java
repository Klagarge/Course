package C07_POO.C071_classes_et_objets;

public class Car {
    String color = "";
    String type = "";
    int maxSpeed;

    public String getStringRepresentation() {
        String s = type;
        s += " ";
        s += color;
        s += ", vitesse max: ";
        s += maxSpeed;
        s += "km/h";
        return s;
    }
}
