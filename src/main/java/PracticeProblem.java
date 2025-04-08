import java.io.*;
import java.util.*;

public class PracticeProblem {

	public static String getName(int line1, String file1) {
		try {
			File newFile = new File(file1);
			Scanner scanner = new Scanner(newFile);
			int count = 1;
			while (scanner.hasNextLine()) {
			String nextLine = scanner.nextLine();
			if (count == line1) {
			String[] words = nextLine.split(" ");
			return words[0] + " " + words[1];
		} 
			count++;
		} 
			scanner.close();
		} catch (FileNotFoundException e) {
			return "File Not Found";
		} catch (Exception e) {
			return "Error reading File";
		}
	return "";
	}

	public static int getNumber(int line1, String file1) {
		try {
			File newFile = new File(file1);
			Scanner scanner = new Scanner(newFile);
			int count = 1;
			while (scanner.hasNextLine()) {
			String nextLine = scanner.nextLine();
			if (count == line1) {
			String[] studentNumber = nextLine.split("\\s+");
			return Integer.parseInt(studentNumber[3]);
			}
			count++;
			} 
			scanner.close();
		} catch (FileNotFoundException e) {
			return -1;
		} catch (Exception e) {
			return -1;
		}
	return -1;
	}

	public static int getAge(int line1, String file1) {
		try{
			File newFile = new File(file1);
			Scanner newScanner = new Scanner(newFile);
			int count = 1;
			while (newScanner.hasNextLine()) {
			String nextLine = newScanner.nextLine();
			if (count == line1) {
			String[] Age = nextLine.split("\\s+");
			return Integer.parseInt(Age[2]);
			}
			count++;
			}
			newScanner.close();
		} catch (FileNotFoundException e) {
			return -1;
		} catch (Exception e) {
			return -1;
		}
	return -1;
	}

	public static void fileAppend(String Output1, String FileName1) {
		try (PrintWriter newWriter = new PrintWriter(new FileWriter(FileName1, true))){
			
		newWriter.print(Output1);

		} 
		catch (IOException e) {
				
		}
	}
	
	


	public static void main(String args[]) {
		String result1 = getName(1, "file.txt");
		System.out.println(result1);

		int result2 = getAge(1, "file.txt");
		System.out.println(result2);

		int result3 = getNumber(1, "file.txt");
		System.out.println(result3);

		fileAppend("Hello", "fileAppend.txt");
		
	
	}
}
