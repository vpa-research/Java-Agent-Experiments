package org.huawei.agent;

import org.huawei.agent.util.AgentArgsHandler;
import org.huawei.agent.util.OriginalClassesReplacerReader;

import java.io.IOException;
import java.lang.instrument.Instrumentation;
import java.util.jar.JarFile;
//Tutorial:
//https://github.com/turn/RedefineClassAgent

public class AgentLauncher {

    private static volatile Instrumentation instrumentation = null;

    public static void premain(String agentArgs, Instrumentation inst) throws IOException {
        System.out.println("Agent was loaded...");
        AgentArgsHandler.setArgs(agentArgs);
        JarFile jar = new JarFile(AgentArgsHandler.generatedClassesJarPath());
        inst.appendToSystemClassLoaderSearch(jar);
        instrumentation = inst;
        instrumentation.addTransformer(new AsmTransformer());
    }


}
