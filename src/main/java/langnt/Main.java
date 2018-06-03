package langnt;

import langnt.lang.engine.LangntEngine;

public class Main {

    public static void main(String... args) {

        String file;
        if (args.length > 0) {
            file = args[0];
        } else {
            System.out.println("java -jar langnt.jar <path_to_source_file>");
            return;
        }

        try {
            System.out.println(file);
            LangntEngine
                    .file(file)
                    .run();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}