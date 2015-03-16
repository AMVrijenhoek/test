import javax.swing.*;

/**
 * Created by Arjen on 11-2-2015.
 */
public class Proef
{
    public static void main(String[] args)
    {
        int a=leesGeheelGetal();
        int b=leesGeheelGetal();
        System.out.println(a+b);
        showAnswer(a+b);
    }

    public static int leesGeheelGetal()
    {
        String text = JOptionPane.showInputDialog(null,"Vul een geheel getal in.","Optellen",3);
        int getal = Integer.parseInt(text);
        return getal;
    }

    public static void showAnswer(int answer)
    {
        JOptionPane.showMessageDialog(null,answer,"Answer",JOptionPane.INFORMATION_MESSAGE);
    }
}