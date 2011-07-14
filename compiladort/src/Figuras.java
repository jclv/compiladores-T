
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import vista.Vista;
import modelo.Modelo;
import controlador.Controlador;
import java.awt.Color;
import java.awt.GridLayout;
import vista.Lateral;

public class Figuras {
<<<<<<< HEAD
=======
	
	public static void main(String[] args) {
		try{
			final JFrame frame = new JFrame();
			frame.setTitle("Ejemplo Modelo Vista Controlador (MVC) Comp�ladores e Interpretes UNET");
			//Set the window initial Size & default close operation
			frame.setVisible(true);
			Dimension fullscreen = Toolkit.getDefaultToolkit().getScreenSize();
			fullscreen.width=fullscreen.width-400;
			fullscreen.height=fullscreen.height-400;
			frame.setBounds(50,50,fullscreen.width,fullscreen.height);
			frame.getContentPane().setPreferredSize(fullscreen);
			frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		    Container guiobjects = frame.getContentPane();
		    guiobjects.setLayout(new BorderLayout());
			Modelo modelo = new Modelo();
			Vista vista = new Vista(new Dimension(1000,800),modelo);
			final Controlador controlador = new Controlador(modelo,vista);
			vista.controlador=controlador; //Lo registro para su uso, deberia ser un metodo pero por simplificacion
			JScrollPane ModelScroll = new JScrollPane(controlador.getVista(), ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
			guiobjects.add(ModelScroll);
			/*ModelScroll.repaint();
			frame.repaint();*/
			frame.pack();
		}catch (RuntimeException e){
			exitApplication();
		}

	}
>>>>>>> be86350da8132b2f65dd57236a06674f9e064ef9

    public static void main(String[] args) {
        try {
            final JFrame frame = new JFrame();
            Lateral lateral=new Lateral();            
            frame.add(lateral.getLateral());
            frame.setTitle("Graficador de Tostones 2011");
            frame.setVisible(true);
            Dimension fullscreen = Toolkit.getDefaultToolkit().getScreenSize();
            fullscreen.width = 800;
            fullscreen.height = 600;
            frame.setSize(800, 600);
            frame.getContentPane().setPreferredSize(fullscreen);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            Container guiobjects = frame.getContentPane();
            Modelo modelo = new Modelo();
            Vista vista = new Vista(new Dimension(500, 500), modelo);
            final Controlador controlador = new Controlador(modelo, vista);
            vista.controlador = controlador; //Lo registro para su uso, deberia ser un metodo pero por simplificacion
            JScrollPane ModelScroll = new JScrollPane(controlador.getVista(), ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
            guiobjects.add(ModelScroll);
            ModelScroll.repaint();
            frame.repaint();
            frame.setLayout(null);            
            frame.pack();

        } catch (RuntimeException e) {
            exitApplication();
        }
    }

    public static void exitApplication() {
        System.out.println("Saliendo Adios...");
        System.exit(0);
    }
}
/*
 * if(event.getClickCount()==2){
JOptionPane.showMessageDialog(null, e, "ERROR", JOptionPane.WARNING_MESSAGE);
}
<<<<<<< HEAD
 */
=======
/*
 * if(event.getClickCount()==2){
                                JOptionPane.showMessageDialog(null, e, "ERROR", JOptionPane.WARNING_MESSAGE);
                            }
 */
>>>>>>> be86350da8132b2f65dd57236a06674f9e064ef9
