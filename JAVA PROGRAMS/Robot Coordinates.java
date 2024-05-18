/*
The initial x and y co-ordinate values of a Robot are passed as the input.
The rest of the input values are the directions in which the Robot moves along with the
distance in that direction.
The directions are denoted by N, E, S, W for North, East, South and West.
The program should print the final x and y co-ordinates of the Robot.

The input will be a single string value with the above details separated by one or more
spaces.

Boundary Conditions:
The length of the input string will be less than 100.

Example Input/Output:
If the input string is x2 y1 N3 E2 S1 the output must be x4 y3
If the input string is x-2 y3 N1 W3 the output must be x-5 y4
*/

public class ExtractDigits {
    public static void main(String[] args) {
        String input = "x-5 y1 N4 E2 S3";

        // Initialize coordinates
        int x = 0, y = 0;
        boolean xSet = false, ySet = false;

        StringBuilder currentNumber = new StringBuilder();
        boolean isNegative = false;

        // Parse the input to get the initial coordinates
        for (char c : input.toCharArray()) {
            if (c == '-') {
                if (currentNumber.length() > 0) {
                    if (!xSet) {
                        x = Integer.parseInt(currentNumber.toString());
                        xSet = true;
                    } else if (!ySet) {
                        y = Integer.parseInt(currentNumber.toString());
                        ySet = true;
                    }
                    currentNumber.setLength(0); // reset the current number builder
                }
                isNegative = true;
            } else if (Character.isDigit(c)) {
                if (isNegative) {
                    currentNumber.append('-');
                    isNegative = false;
                }
                currentNumber.append(c);
            } else {
                if (currentNumber.length() > 0) {
                    if (!xSet) {
                        x = Integer.parseInt(currentNumber.toString());
                        xSet = true;
                    } else if (!ySet) {
                        y = Integer.parseInt(currentNumber.toString());
                        ySet = true;
                    }
                    currentNumber.setLength(0); // reset the current number builder
                }
                isNegative = false;
            }
        }
        
        if (currentNumber.length() > 0) {
            if (!xSet) {
                x = Integer.parseInt(currentNumber.toString());
            } else if (!ySet) {
                y = Integer.parseInt(currentNumber.toString());
            }
        }

        // Process the movement instructions
        String[] parts = input.split(" ");
        for (String part : parts) {
            if (part.startsWith("N")) {
                y += Integer.parseInt(part.substring(1));
            } else if (part.startsWith("E")) {
                x += Integer.parseInt(part.substring(1));
            } else if (part.startsWith("S")) {
                y -= Integer.parseInt(part.substring(1));
            } else if (part.startsWith("W")) {
                x -= Integer.parseInt(part.substring(1));
            }
        }

        // Print the final coordinates
        System.out.println("x" + x + " y" + y);
    }
}
