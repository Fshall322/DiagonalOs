/**
 * Created by Frank Hall on 6/25/2016.
 */
class DiagonalOs
{
    public static void main(String[] args)
    {
        int x,y;
        int num;
        String msg="";
        num=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a Number: "));
        for(x=0;x<num;++x)
        {
            for(y=0;y<x;++y)
            {
                msg+="          ";
            }
            msg+="O                        O                        O\n";
        }
        JOptionPane.showMessageDialog(null,""+msg);
    }
}
