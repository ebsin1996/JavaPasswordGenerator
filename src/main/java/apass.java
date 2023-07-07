import java.util.Random;

public class apass {

	public static void main(String[] args) {
		
		
		    
		        int numberOfStrings = 5; // Specify the number of strings to generate
		        int stringLength = 6; // Specify the length of each random string

		        String[] randomStrings = generateRandomStrings(numberOfStrings, stringLength);

		        // Print the generated random strings
		        for (String str : randomStrings) {
		            System.out.println(str);
		        }
		    }

		    public static String[] generateRandomStrings(int numberOfStrings, int stringLength) {
		        String[] randomStrings = new String[numberOfStrings];
		        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		        Random random = new Random();

		        for (int i = 0; i < numberOfStrings; i++) {
		            StringBuilder sb = new StringBuilder();
		            for (int j = 0; j < stringLength; j++) {
		                int index = random.nextInt(characters.length());
		                char randomChar = characters.charAt(index);
		                sb.append(randomChar);
		            }
		            randomStrings[i] = sb.toString();
		        }

		        return randomStrings;
		    }
		}

		
    

	


