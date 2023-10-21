//Utilizando o Singleton como praticado na Aula

public class TabuleiroXadrez {

    static private TabuleiroXadrez instance = null;

    private TabuleiroXadrez() {}
    static TabuleiroXadrez getInstance ()
    {
        if (instance == null)
            instance = new TabuleiroXadrez();
        return instance;
    }


    public static void main (String args[])
    {
        TabuleiroXadrez tabuleiro1 = TabuleiroXadrez.getInstance();
        TabuleiroXadrez tabuleiro2 = TabuleiroXadrez.getInstance();
        TabuleiroXadrez tabuleiro3 = TabuleiroXadrez.getInstance();
        TabuleiroXadrez tabuleiro4 = TabuleiroXadrez.getInstance();
        System.out.println(tabuleiro1);
        System.out.println(tabuleiro2);
        System.out.println(tabuleiro3);
        System.out.println(tabuleiro4);
    }

}