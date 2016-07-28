package Proxy_Desting_Patter;

/**
 * Created by Sebastian on 2016-07-28.
 */
public class CommandExecutorImpl implements CommandExecutor {
    @Override
    public void runCommand(String cmd) throws Exception {
        Runtime.getRuntime().exec(cmd);
        System.out.println("'"+ cmd + "'comand execute.");

    }
}
