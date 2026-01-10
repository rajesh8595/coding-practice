public class Main {
    public static void main(String[] args) {
        String input = "aaaabbcddde";
        StringBuilder output = new StringBuilder();

        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                output.append(input.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        // Append the last character and its count
        output.append(input.charAt(input.length() - 1)).append(count);

        System.out.println("Output: " + output.toString());
    }
}
