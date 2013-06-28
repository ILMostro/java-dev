import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextEditor extends JFrame implements
                                       ActionListener
{
   private JMenuBar menuMB =
                     new JMenuBar(); //create the menu bar
   private JMenu fileM, editM, optionM;
   private JMenuItem exitI;
   private JMenuItem cutI, copyI, pasteI, selectI;
   private JTextArea pageTA = new JTextArea();
   private String scratchpad = "";

   public TextEditor()
   {
       setTitle("Simple Text Editor");

       Container pane = getContentPane();

       pane.setLayout(new BorderLayout());
       pane.add(pageTA, BorderLayout.CENTER);
       pane.add(new JScrollPane(pageTA));
       pageTA.setLineWrap(true);

       setJMenuBar(menuMB);
       setFileMenu();
       setEditMenu();
       setSize(300, 200);

       setVisible(true);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
   }

   private void setFileMenu()
   {
       fileM = new JMenu("File");
       menuMB.add(fileM);
       exitI = new JMenuItem("Exit");
       fileM.add(exitI);
       exitI.addActionListener(this);
   }

   private void setEditMenu()
   {
       editM = new JMenu("Edit");
       menuMB.add(editM);
       cutI = new JMenuItem("Cut");
       editM.add(cutI);
       cutI.addActionListener(this);
       copyI = new JMenuItem("Copy");
       editM.add(copyI);
       copyI.addActionListener(this);
       pasteI = new JMenuItem("Paste");
       editM.add(pasteI);
       pasteI.addActionListener(this);
       selectI = new JMenuItem("Select All");
       editM.add(selectI);
       selectI.addActionListener(this);
   }

   public void actionPerformed(ActionEvent e)
   {
       JMenuItem mItem = (JMenuItem) e.getSource();

       if (mItem == exitI)
       {
           System.exit(0);
       }
       else if (mItem == cutI)
       {
           scratchpad = pageTA.getSelectedText();
           pageTA.replaceRange("",
                       pageTA.getSelectionStart(),
                       pageTA.getSelectionEnd());
       }
       else if (mItem == copyI)
           scratchpad = pageTA.getSelectedText();
       else if (mItem == pasteI)
           pageTA.insert(scratchpad, pageTA.getCaretPosition());
       else if (mItem == selectI)
           pageTA.selectAll();
   }

   public static void main(String args[])
   {
       TextEditor texted = new TextEditor();
   }
}
