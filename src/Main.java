import os.factory.OS;
import os.factory.OperatingSystemFactory;

public class Main {
    public static void main(String[] args) {

        System.out.println(OperatingSystemFactory.getInstance("Ubuntu").specs());

    }
}
