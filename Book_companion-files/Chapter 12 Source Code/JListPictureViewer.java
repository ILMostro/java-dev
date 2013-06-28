//Program to demonstrate JLIST

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class JListPictureViewer extends JFrame implements
                                     ListSelectionListener
{
    private String[] pictureNames = {"Pie Diagram",
                                     "Line Graph",
                                     "Bar Graph",
                                     "Table",
                                     "Normal Curve"};

    private ImageIcon[] pictures =
                  {new ImageIcon("pieDiagram.jpg"),
                   new ImageIcon("lineGraph.jpg"),
                   new ImageIcon("barGraph.jpg"),
                   new ImageIcon("table.jpg"),
                   new ImageIcon("normalCurve.jpg")};

    private JList pictureJList;
    private JScrollPane selectionJS;
    private JLabel promptJL;
    private JLabel displayPicJL;
    private JLabel infoJL;

    public JListPictureViewer()
    {
       super("Photo Viewer");

       Container pane = getContentPane();
       pane.setLayout(null);

       promptJL = new JLabel("Select an Image",
                             SwingConstants.CENTER);
       promptJL.setSize(350, 20);
       promptJL.setLocation(10, 0);
       pane.add(promptJL);

       pictureJList = new JList(pictureNames);
       pictureJList.setVisibleRowCount(3);
       pictureJList.setSelectionMode
                   (ListSelectionModel.SINGLE_SELECTION);
       pictureJList.addListSelectionListener(this);

       selectionJS = new JScrollPane(pictureJList);
       selectionJS.setSize(350, 60);
       selectionJS.setLocation(10, 20);
       pane.add(selectionJS);

       displayPicJL = new JLabel(pictures[4]);
       displayPicJL.setSize(350, 350);
       displayPicJL.setLocation(10, 50);

       pane.add(displayPicJL);

       infoJL = new JLabel(pictureNames[4],
                           SwingConstants.CENTER);
       infoJL.setSize(350, 20);
       infoJL.setLocation(10, 380);
       pane.add(infoJL);

       setSize (380, 440);
       setVisible(true);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String args[])
    {
       JListPictureViewer picViewer = new JListPictureViewer();
    }

    public void valueChanged(ListSelectionEvent e)
    {
        displayPicJL.setIcon(
              pictures[pictureJList.getSelectedIndex()]);
        infoJL.setText(
              pictureNames[pictureJList.getSelectedIndex()]);
        repaint();
    }
}
