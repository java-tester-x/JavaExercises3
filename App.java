import src.ApplicationWindow;

public class App {

    public static void main(String[] args)
    {
        final String text = "Simple Todo List";

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                final ApplicationWindow wnd = new ApplicationWindow(text);
                wnd.setVisible(true);                
            }
        });
    }
}

