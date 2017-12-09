

package vista;

import controlador.GestionDato;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class VentanaCurso extends JInternalFrame {
    
    private List<JLabel> etiquetaList;
    private List<JButton> botonList;
    private List<JTextField> txtList;
    private Object[][] datos;
    private Object[] encabezado;
    private DefaultTableModel modeloTabla;
    private JTable tabla;
    private JScrollPane scroll;
    private GestionDato gD;
    private JComboBox comboBox;

    public VentanaCurso(GestionDato gD) {
        super("Registro ", true, true, true, true);
        this.setSize(500, 300);
        this.gD = gD;
        iniciaComponente();
    }
    
    
}
