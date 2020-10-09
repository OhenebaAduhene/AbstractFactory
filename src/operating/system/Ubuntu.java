package operating.system;

import os.factory.OS;

public class Ubuntu implements OS {
    @Override
    public String specs() {
        return "Ubuntu is for developers";
    }
}
