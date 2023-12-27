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
    }
}
