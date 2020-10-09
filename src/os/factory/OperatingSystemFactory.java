package os.factory;

import operating.system.IOS;
import operating.system.Linux;
import operating.system.Ubuntu;
import operating.system.Windows;

public class OperatingSystemFactory {

    public static OS getInstance(String type){

        if(type.equals("IOS"))
            return new IOS();
        else if(type.equals("Linux"))
            return new Linux();
        else if(type.equals("Windows"))
            return new Windows();
        else
            return new Ubuntu();
    }
}
