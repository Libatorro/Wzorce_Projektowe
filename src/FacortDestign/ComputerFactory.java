package FacortDestign;

/**
 * Created by Sebastian on 2016-07-28.
 */


public class ComputerFactory {
    public static Computer getComputer(String type, String cpu, String hdd, String ram) {
            if("PC".equalsIgnoreCase(type))return new PC(ram, hdd, cpu);
            else if("Server".equalsIgnoreCase(type))return new Server(ram, hdd, cpu);
    return  null;
    }


}
