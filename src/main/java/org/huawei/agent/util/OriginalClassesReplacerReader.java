package org.huawei.agent.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OriginalClassesReplacerReader {
    private Map<String,String> classesMatcher = new HashMap<>();

    public Map<String,String> readClassesFile() {
        try {
            File file = new File(AgentArgsHandler.replacerClassesTxtPath());
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String currentClassesLine = scanner.nextLine();
                addNewClasses(currentClassesLine);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return classesMatcher;
    }

    private void addNewClasses(String currentClassesLine){
        String[] classes = currentClassesLine.split(" ");
        classesMatcher.put(classes[0].trim(), classes[1].trim());
    }
}
