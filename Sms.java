public class Sms extends Notifica {
    
    public Sms(String destinatario, String messaggio) {
        super(destinatario, messaggio);
    }

    @Override
    public String invia() {
        return "Invio SMS a " + destinatario + ": " + messaggio;
    }
}
