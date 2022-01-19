package Programs;
class Demo
{
    public static void main(String[] args)
    {
        String str = "9566641005";
        System.out.println(Nambiar_Number(str, 0));
    }

    static String Nambiar_Number(String str, int i)
    {
        int fd, d, td, pd;
        if (i >= str.length())
            return "";
        fd = (str.charAt(i) - '0');
        d = fd % 2;
        td = 0;
        while (i < str.length()) 
        {
            td += (str.charAt(i) - '0');
            pd = td % 2;
            if (d != pd)
            {
                break;
            }
            i++;
        }
        return ("" + td + Nambiar_Number(str, i + 1));
    }
}