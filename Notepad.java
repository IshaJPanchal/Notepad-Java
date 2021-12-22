import javax.swing.*;    
import java.awt.event.*;    
public class Notepad implements ActionListener{    
JFrame f;    
JMenuBar mb;    
JMenu edit;    
JMenuItem cut,copy,paste,selectAll;    
JTextArea ta;    
Notepad(){    
f=new JFrame();    
cut=new JMenuItem("cut");    
copy=new JMenuItem("copy");    
paste=new JMenuItem("paste");    
selectAll=new JMenuItem("selectAll");    
cut.addActionListener(this);    
copy.addActionListener(this);    
paste.addActionListener(this);    
selectAll.addActionListener(this);    
mb=new JMenuBar();    
    
edit=new JMenu("Edit");    
     
edit.add(cut);edit.add(copy);edit.add(paste);edit.add(selectAll);    
mb.add(edit);    
ta=new JTextArea();
ta.setBounds(5,5,360,320);    
ta.setLineWrap(true);
ta.setWrapStyleWord(true);
f.add(mb);f.add(ta);    
f.setJMenuBar(mb);  
f.setLayout(null);    
f.setSize(400,400);    
f.setVisible(true);    
}     
public void actionPerformed(ActionEvent e) {    
if(e.getSource()==cut)    
ta.cut();    
if(e.getSource()==paste)    
ta.paste();    
if(e.getSource()==copy)    
ta.copy();    
if(e.getSource()==selectAll)    
ta.selectAll();    
}     
public static void main(String[] args) {    
    new Experiment15();    
}    
}    