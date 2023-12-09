import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TabelaDePersonagens extends JFrame {

   private DefaultTableModel tableModel;
   private Exercito exercito;
   private JTextArea armyStatusTextArea;

   public TabelaDePersonagens() {
      // Gerar  tabela
      tableModel = new DefaultTableModel(new Object[][]{}, new String[]{"Nome", "pontosDeVida", "nivelArmadura", ""});

      // Gerar  tabela
      JTable table = new JTable(tableModel);

      // Criar  o scroll para tabela
      JScrollPane scrollPane = new JScrollPane(table);

      // Create the buttons "Adicionar" and "Eliminar"
      JButton btnAdicionar = new JButton("Adicionar");
      JButton btnEliminar = new JButton("Eliminar");

      // Criar o panel para botôes
      JPanel panelBotoes = new JPanel();
      panelBotoes.add(btnAdicionar);
      panelBotoes.add(btnEliminar);

      // Criando uma instancia da classe Exercito
      exercito = new Exercito();

      // Criar a JTextArea para fazer display
      armyStatusTextArea = new JTextArea(35, 30);
      armyStatusTextArea.setEditable(false);

      // Criar a JScrollPane  text area
      JScrollPane armyStatusScrollPane = new JScrollPane(armyStatusTextArea);

      //  Adicionarr JTextArea para main frame
      add(armyStatusScrollPane, BorderLayout.EAST);

      // Adicionar o scrollpane e the button panel ao main frame
      add(scrollPane);
      add(panelBotoes, BorderLayout.SOUTH);

      // Add an action listener to the "Adicionar" button
      btnAdicionar.addActionListener(e -> {
         tableModel.addRow(new Object[]{"", "", "", ""});
      });

      // Adicionar os comandos an action listener  "Eliminar" button
      btnEliminar.addActionListener(e -> {
         int selectedRow = table.getSelectedRow();
         if (selectedRow != -1) {
            tableModel.removeRow(selectedRow);
         }
      });

      // Ajustar o tamanho
      setSize(800, 400);
      setTitle("Herois, Bestas e Exercito");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
   }

   public static void main(String[] args) {

      new TabelaDePersonagens();
   }
}