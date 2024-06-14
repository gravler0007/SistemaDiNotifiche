public class Email extends Notifica {

    public Email(String destinatario, String messaggio) {
        super(destinatario, messaggio);
    }

    @Override
    public String invia() {
        return "Invio email a " + destinatario + ": " + messaggio;
    }
}
