public class Main {
    public static void main(String[] args) {
        Notifica[] notifiche = {
                new Email("flavio@example.com", "Questo è un messaggio email"),
                new Sms("123456789", "Questo è un messaggio SMS"),
                new NotificaApp("flavio123", "Questo è un messaggio in-app")
        };

        for (Notifica notifica : notifiche) {
            System.out.println(notifica.invia());
        }
    }
}
