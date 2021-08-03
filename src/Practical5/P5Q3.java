package Practical5;

public class P5Q3 {
    public static void main(String[] args) {
        String title, fname = "";

        title = args[args.length - 1];
        for (int i = 0; i < args.length; i++) {
            String name = args[i].toLowerCase();
            if (name.charAt(0) == '[')
                name = name.replace(name.charAt(1), Character.toUpperCase(name.charAt(1)));
            else
                name = name.replace(name.charAt(0), Character.toUpperCase(name.charAt(0)));

            fname += " " + name;

            int startSN = fname.indexOf('[');
            int endSN = fname.indexOf(']');
            String surname = fname.substring(startSN + 1, endSN);

            fname = fname.replace("]", "");
            fname = fname.replace("[", "");

            System.out.println("To: " + fname);
            System.out.println("Wishing you a Merry Chirstmas, " + title + " " + surname);
        }

    }
}
