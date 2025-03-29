class Device{
int deviceId;
String status;
Device(int deviceId, String status) {
    this.deviceId = deviceId;
    this.status = status;
}
void displayStatus() {
    System.out.println("Status: " + status);
}
}
class Thermostat extends Device {

String temperatureSettings;

Thermostat(String temperatureSettings, int deviceId, String Status) {
    super(deviceId, Status);
    this.temperatureSettings = temperatureSettings;
}
@Override
void displayStatus() {
    System.out.println("Status: " + status);
    System.out.println("Temperature setting: " + temperatureSettings);
}
}
public class SmartHome {

public static void main(String[] args) {
    Thermostat thermostat = new Thermostat("Hot", 1, "On");
    thermostat.displayStatus();
}
}