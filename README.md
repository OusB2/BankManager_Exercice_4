#  BankManager - Application de Gestion Bancaire

##  Description du Projet
Ce projet est une application Java développée dans le cadre de l'unité de formation en **Programmation Orientée Objet (POO)**. Il simule un gestionnaire de comptes bancaires pour illustrer les mécanismes fondamentaux de la programmation structurée et évolutive.

---

##  Concepts POO Mis en Œuvre
Pour cet exercice, nous avons appliqué les piliers suivants du cours :

*   **Héritage (`extends`)** : La classe `BankAccount` sert de socle commun. Toutes les autres classes (Checking, Savings, COD) héritent de ses attributs `account` et `balance`[cite: 1].
*   **Spécialisation des Classes** : Chaque classe enfant possède ses propres propriétés spécifiques (ex: la limite pour un compte courant)[cite: 1].
*   **Encapsulation & Instanciation** : Création d'objets réels dans la méthode `main` et manipulation des données via les instances[cite: 1].

---

##  Structure des Fichiers
Le projet est organisé en 5 fichiers sources :

1.  **`BankAccount.java`** : Classe mère définissant les bases d'un compte (Numéro et Solde)[cite: 1].
2.  **`CheckingAccount.java`** : Extension pour les comptes courants avec un attribut `limit`[cite: 1].
3.  **`SavingsAccount.java`** : Extension pour les comptes d'épargne[cite: 1].
4.  **`COD.java`** : Extension pour les Certificats de Dépôt[cite: 1].
5.  **`BankManager.java`** : Point d'entrée de l'application (contient le `main`)[cite: 1].

---

## Auteur
**Bamba Ousmane RGL 3 B**

