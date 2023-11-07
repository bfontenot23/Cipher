public class Cipher {


    /*
    ASCII ranges:
        Capital Letters: 65 - 90
        Lowercase Letters: 97 - 122
        Numbers: 48 - 57
     */
    private String message;
    private int key;
    private boolean encrypted;

    /*
     * Cipher - constructor for Cipher class
     * @param message - string for the message of the cipher
     * @param key - integer for the key of the cipher
     */
    public Cipher(String message, int key)
    {
        this.message = message;
        this.key = key;
        this.encrypted = false;
    }


    /*
     * getMessage - gets the value of the message member
     * @return - string of message member
     */
    public String getMessage()
    {
        return this.message;
    }

    /*
     * isEncrypted - gets the value of the encrypted member
     * @return - boolean of encrypted member
     */
    public boolean isEncrypted()
    {
        return encrypted;
    }

    /*
     * encrypt - encrypts the message member using the key
     */
    public void encrypt()
    {
        if(!encrypted)
        {
            char[] message = this.message.toCharArray();
            for(int i=0; i<message.length;i++)
            {
                if(message[i]>=48&&message[i]<=57)
                {
                    for(int j = 0; j<key; j++)
                    {
                        message[i]++;
                        if(message[i]>57) message[i] = 48;
                    }
                }
                if(message[i]>=65&&message[i]<=90)
                {
                    for(int j = 0; j<key; j++)
                    {
                        message[i]++;
                        if(message[i]>90) message[i] = 65;
                    }
                }
                if(message[i]>=97&&message[i]<=122)
                {
                    for(int j = 0; j<key; j++)
                    {
                        message[i]++;
                        if(message[i]>122) message[i] = 97;
                    }
                }
            }
            this.message = String.valueOf(message);
            encrypted = true;
        }
        else System.out.print("This message is already encrypted.");
    }

    /*
     * decrypt - decrypts the message member using the key
     */
    public void decrypt()
    {
        if(encrypted)
        {
            char[] message = this.message.toCharArray();
            for(int i=0; i<message.length;i++)
            {
                if(message[i]>=48&&message[i]<=57)
                {
                    for(int j = 0; j<key; j++)
                    {
                        message[i]--;
                        if(message[i]<48) message[i] = 57;
                    }
                }
                if(message[i]>=65&&message[i]<=90)
                {
                    for(int j = 0; j<key; j++)
                    {
                        message[i]--;
                        if(message[i]<65) message[i] = 90;
                    }
                }
                if(message[i]>=97&&message[i]<=122)
                {
                    for(int j = 0; j<key; j++)
                    {
                        message[i]--;
                        if(message[i]<97) message[i] = 122;
                    }
                }
            }
            this.message = String.valueOf(message);
            encrypted = false;
        }
        else System.out.print("This message is already decrypted.");
    }


}
