public class ConcatenateString {
    public static String concatenateNames(String[] names) {
        StringBuilder result = new StringBuilder();

        for (String name : names) {
            name = name.replace(" ", "");
            result.append(name).append(" ");
        }

        result.setLength(result.length() > 0 ? result.length() - 1 : 0);
        result.append(".");
        
        return result.toString();
    }
}
