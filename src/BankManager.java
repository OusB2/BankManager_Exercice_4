public class BankManager {
    public static void main(String[] args) {

        // Création des 3 instances (objets)[cite: 1]
        CheckingAccount monCourant = new CheckingAccount();
        SavingsAccount monEpargne = new SavingsAccount();
        COD monCertificat = new COD();

        // Test : On définit les valeurs (SET)[cite: 1]
        // On remarque qu'on peut accéder à 'account' même s'il est dans la classe mère
        monCourant.account = "CC-2026";
        monCourant.balance = 50000.0;
        monCourant.limit = 10000.0;

        monEpargne.account = "EP-789";
        monEpargne.balance = 250000.0;

        monCertificat.account = "COD-123";
        monCertificat.balance = 1000000.0;

        // Test : On lit les valeurs (GET)[cite: 1]
        System.out.println("--- INFOS COMPTES ---");
        System.out.println("Courant ID : " + monCourant.account + " | Solde : " + monCourant.balance);
        System.out.println("Epargne ID : " + monEpargne.account + " | Solde : " + monEpargne.balance);
        System.out.println("Certificat ID : " + monCertificat.account + " | Solde : " + monCertificat.balance);
    }
}