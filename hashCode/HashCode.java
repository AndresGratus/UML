package hashCode;

public class HashCode {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Andres", 20);
        Persona persona2 = new Persona("Angelica", 21);

        System.out.println(persona1.hashCode()+ " " + persona2.hashCode());
    }
}
