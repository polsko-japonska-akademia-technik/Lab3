// autorzy: Adrian Witkowski
// data wykonania: 27.04.2019
// cel: Palindrom

public class Palindrom
{
    private String tekst;

    public Palindrom (String tekst)
    {
        this.tekst = tekst;
    }

    public void CzyJestPalindromem()
    {
        Boolean ok = true;
        int k = tekst.length() - 1;
        for (int i = 0; i < tekst.length(); i++)
        {
            if (tekst.charAt(i) != tekst.charAt(k))
            {
                ok = false;
                break;
            }
            k--;
        }

        if (ok == false)
        {
            System.out.println("Tekst \""+tekst+"\" nie jest palindromem");
        }
        else
        {
            System.out.println("Tekst \""+tekst+"\" jest palindromem");
        }
    }

}