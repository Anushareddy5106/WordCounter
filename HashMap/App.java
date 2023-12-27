package HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Word Counter!");

        // UC1
        HashMap map = new HashMap("To be or not to be");
        System.out.println("Frequency of or : " + map.get("or"));

        System.out.println("Frequency of be : " + map.get("be"));
        map.add("Be");
        System.out.println("Frequency of be after adding: " +
                map.get("Be"));

        // UC2
        HashMap para = new HashMap(
                "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations");

        System.out.println("Frequency of they: " + para.get("they"));

        para.add("They");
        System.out.println("Frequency of they after adding another they: " + para.get("they"));

        // UC3
        para.remove("they");
        System.out.println("Frequency of they after removing they: " + para.get("they"));
    }
}
