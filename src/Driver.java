
public class Driver {

    public static void main(String[] args) {

        String s1 = "Hello, World!";
        String s2 = "Try this on for size!";
        String s3 = "THIS IS SUPER SECRET";

        Cipher c1 = new Cipher(s1, (char) 13);
        Cipher c2 = new Cipher(s2,(char) 6);
        Cipher c3 = new Cipher(s3,(char) 2);

        c1.encrypt();
        System.out.printf("[*]C1: %s\tC2: %s\t\tC3: %s\n",(c1.isEncrypted()) ? "Encrypted" : "Unencrypted",(c2.isEncrypted()) ? "Encrypted" : "Unencrypted",(c3.isEncrypted()) ? "Encrypted" : "Unencrypted");
        c2.encrypt();
        c3.encrypt();
        System.out.printf("[*]Encrypting %s with a key of %d gives us %s\n", s1,13,c1.getMessage());
        System.out.printf("[*]Encrypting %s with a key of %d gives us %s\n", s2,6,c2.getMessage());
        System.out.printf("[*]Encrypting %s with a key of %d gives us %s\n", s3,2,c3.getMessage());

        c1.decrypt();
        c2.decrypt();
        System.out.printf("[*]C1: %s\tC2: %s\t\tC3: %s\n",(c1.isEncrypted()) ? "Encrypted" : "Unencrypted",(c2.isEncrypted()) ? "Encrypted" : "Unencrypted",(c3.isEncrypted()) ? "Encrypted" : "Unencrypted");
        c3.decrypt();
        System.out.printf("[*]Now decrypted:\n");
        System.out.printf("[*]C1 -> %s\n",c1.getMessage());
        System.out.printf("[*]C2 -> %s\n",c2.getMessage());
        System.out.printf("[*]C3 -> %s\n",c3.getMessage());

    }

}
