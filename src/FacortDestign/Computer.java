package FacortDestign;

/**
 * Created by Sebastian on 2016-07-28.
 */
public abstract class Computer {

    public abstract String getRAM();

    public abstract String getHHD();

    public abstract String getCPU();


    @Override

    public String toString() {


        return "RAM " + getRAM() + " , HDD " + getHHD() + ",CPU " + getCPU();
    }


}
