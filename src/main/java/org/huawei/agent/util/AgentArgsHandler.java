package org.huawei.agent.util;

public class AgentArgsHandler {

    private static String[] args;

    public static void setArgs(String agentArgs){
        AgentArgsHandler.args = agentArgs.split("=");
    }

    public static String generatedClassesJarPath(){
        return args[0];
    }

    public static String replacerClassesTxtPath(){
        return args[1];
    }

}
