public class NotificaApp extends Notifica {

    public NotificaApp(String destinatario, String messaggio) {
        super(destinatario, messaggio);
    }

    @Override
    public String invia() {
        return "Invio notifica in-app a " + destinatario + ": " + messaggio;
    }
}
