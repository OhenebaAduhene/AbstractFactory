package operating.system;

import os.factory.OS;

public class Linux implements OS {
    @Override
    public String specs() {
        return "Linux is for hackers";
    }
}
