public class App {
    public static void main(String[] args) throws Exception {
        int[] values = {5, 10, 11, 14, 30};

        System.out.println("Tests isEven(int)");
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i] + " " + MyInteger.isEven(values[i]));
        }

        System.out.println("\nTests isOdd(int)");
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i] + " " + MyInteger.isOdd(values[i]));
        }

        System.out.println("\nTests isPrime(int)");
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i] + " " + MyInteger.isPrime(values[i]));
        }

        System.out.println("\nTests isEven()");
        for (int i = 0; i < values.length; i++) {
            MyInteger value = new MyInteger(values[i]);
            System.out.println(value.getValue() + " " + value.isEven());
        }

        System.out.println("\nTests isOdd()");
        for (int i = 0; i < values.length; i++) {
            MyInteger value = new MyInteger(values[i]);
            System.out.println(value.getValue() + " " + value.isOdd());
        }

        System.out.println("\nTests isPrime()");
        for (int i = 0; i < values.length; i++) {
            MyInteger value = new MyInteger(values[i]);
            System.out.println(value.getValue() + " " + value.isPrime());
        }

        System.out.println("\nTests isEven(MyInteger)");
        for (int i = 0; i < values.length; i++) {
            MyInteger value = new MyInteger(values[i]);
            System.out.println(value.getValue() + " " + MyInteger.isEven(value));
        }

        System.out.println("\nTests isOdd(MyInteger)");
        for (int i = 0; i < values.length; i++) {
            MyInteger value = new MyInteger(values[i]);
            System.out.println(value.getValue() + " " + MyInteger.isOdd(value));
        }

        System.out.println("\nTests isPrime(MyInteger)");
        for (int i = 0; i < values.length; i++) {
            MyInteger value = new MyInteger(values[i]);
            System.out.println(value.getValue() + " " + MyInteger.isPrime(value));
        }

        int[] values2 = {3, 12, 76};
		MyInteger value = new MyInteger(3);
		System.out.println("\nTest if " + value.getValue() + 
			" is equal to a different value:");
		for (int i = 0; i < values2.length; i++) {
			System.out.println(values2[i] + " " + value.equals(values2[i]));
		}

		System.out.println("\nTest if " + value.getValue() + 
			" is equal to a different value:");
		for (int i = 0; i < values2.length; i++) {
            MyInteger myInt = new MyInteger(values2[i]);
			System.out.println(values2[i] + " " + value.equals(myInt));
		}

        System.out.println("\nTest parseInt(char[]) and parseInt(String):");
		// Create a character array
		char[] numericCharacters = {'6', '2', '4'};

		// Create a string
		String numericString = "189";
		System.out.print("\'");
		for (int i = 0; i < numericCharacters.length; i++) {
		 	System.out.print(numericCharacters[i] + "");
		} 
		System.out.println("\' + \"" + numericString + "\" = " + 
			(MyInteger.parseInt(numericCharacters) + 
			MyInteger.parseInt(numericString)));

    }
}

class MyInteger {
    int value;

    MyInteger (int val) {
        value = val;
    }

    int getValue() {
        return value;
    }

    boolean isEven() {
        return isEven(value);
    }

    boolean isOdd() {
        return isOdd(value);
    }

    boolean isPrime() {
        return isPrime(value);
    }

    static boolean isEven(int val) {
        return val % 2 == 0;
    }

    static boolean isOdd(int val) {
        return val % 2 != 0;
    }

    static boolean isPrime(int val) {
        if (val <= 1) {
            return false;
        }

        for (int i = 2; i < val; i++) {
            if (val % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isEven(MyInteger v) {
        return v.isEven();
    }

    static boolean isOdd(MyInteger v) {
        return v.isOdd();
    }

    static boolean isPrime(MyInteger v) {
        return v.isPrime();
    }

    boolean equals(int val) {
        return this.value == val;
    }

    boolean equals(MyInteger v) {
        return v.value == this.value;
    }

    static int parseInt(char[] chars) {
        int value = 0;
		for (int i = 0, j = (int)Math.pow(10, chars.length - 1); 
			  i < chars.length; i++, j /= 10) {
			value += (chars[i]- 48) * j;
		}
		return value;
    }

    static int parseInt(String str) {
		int value = 0;
		for (int i = 0, j = (int)Math.pow(10, str.length() - 1); 
			  i < str.length(); i++, j /= 10) {
			value += (str.charAt(i) - 48) * j;
		}
		return value;
    }
}
