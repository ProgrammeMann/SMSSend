/**
 * Created by programmemann on 25.12.16.
 */
public class Main {
    public static void main(String[] args) {

        SMS newSMS = new SMS();
        newSMS.send_sms("79178587448", "Дз выполнено", 1, "", "", 0, "", "");
        newSMS.get_sms_cost("79178587448", "Дз выполнено1", 0, 0, "", "");
        newSMS.getBalance();

    }
}
