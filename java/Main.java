
import com.mycompany.tv.Tv;


/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class Main
{
    public static void main(String[] args) {
        Tv tv = new Tv();
	    
		tv.aumentarVolume();
		tv.diminuirVolume();
		tv.alterarCanal(1);
		tv.exibirStatus();
    }
}
