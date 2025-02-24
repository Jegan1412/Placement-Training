import java.util.*;

class SmartHome {

    public static final class Device {
        public static final int MAX_DEVICES = 50;

        private int deviceID;
        private String deviceName;

        public Device() {
            Scanner input = new Scanner(System.in);
            this.deviceID = input.nextInt();
            input.nextLine();
            this.deviceName = input.nextLine();
        }

        public final String getDeviceInfo() {
            return "Device ID: "+deviceID+"\nDevice Name: "+ deviceName;
        }
    }

    public static final class Configuration {
        public static final int MAX_POWER_LIMIT = 5000;
    }

    public abstract static class DeviceType {
        public abstract String getDeviceCategory();
    }

    public static class LightDevice extends DeviceType {
        
        public String getDeviceCategory() {
            return "Light Device";
        }
    }

    public static class FanDevice extends DeviceType {
        
        public String getDeviceCategory() {
            return "Fan Device";
        }
    }

    
}

public class Obj_Cls_Abstraction_SmartHome{
    
    public static void main(String[] args) {
        SmartHome.Device device = new SmartHome.Device();
        System.out.println(device.getDeviceInfo());

        System.out.println("Max Power Limit: " + SmartHome.Configuration.MAX_POWER_LIMIT);

        SmartHome.DeviceType lightDevice = new SmartHome.LightDevice();
        SmartHome.DeviceType fanDevice = new SmartHome.FanDevice();

        System.out.println("Device Category: " + lightDevice.getDeviceCategory());
        System.out.println("Device Category: " + fanDevice.getDeviceCategory());
    }
}
