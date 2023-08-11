package solve;

import java.util.Scanner;

public class Solve {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] storage = new String[10];

        while (true) {

            String[] commandLine = input.nextLine().split(" ");

            String command, fileName;
            int fileNumber;

            try {
                command = commandLine[0];
                if (command.equals("exit")) {
                    return;
                }
                fileName = commandLine[1].substring(0, 4);
                fileNumber = Integer.parseInt(commandLine[1].substring(4));
            } catch (Exception e) {
                continue;
            }

            String fullName = fileName + fileNumber;
            
            if (!(fileNumber >= 1 && fileNumber <= 10)) {
                System.out.printf("Cannot add The file %s\n", fullName);
                continue;
            }

            switch (command) {

                case "add" -> {

                    if (storage[fileNumber - 1] != null) {
                        System.out.printf("Cannot add The file %s\n", fullName);
                        continue;
                    }

                    storage[fileNumber - 1] = fullName;
                    System.out.printf("The file %s added successfully\n", fullName);

                }

                case "get" -> {

                    if (storage[fileNumber - 1] == null) {
                        System.out.printf("The file %s not found\n", fullName);
                        continue;
                    }

                    System.out.printf("The file %s was send\n", fullName);
                    storage[fileNumber - 1] = null;

                }

                case "delete" -> {
                    if (storage[fileNumber - 1] != null) {
                        storage[fileNumber - 1] = null;
                        System.out.printf("The file %s was deleted\n", fullName);
                    } else {
                        System.out.printf("The file %s not found\n", fullName);
                    }

                }

            }
            
        }
    }

}
