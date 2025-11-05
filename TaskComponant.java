import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaskComponant extends JPanel implements ActionListener {
    private JCheckBox checkBox;
    private  JTextPane taskfield;
    private  JButton deletebutton;

    public JTextPane getTaskfield() {
        return taskfield;
    }

    // this panel is used so that we can update to the task component panel when deleting tasks
    private  JPanel parentpanel;


    public TaskComponant(JPanel parentpanel){
        this.parentpanel=parentpanel;

        //task field
        taskfield= new JTextPane();
        taskfield.setPreferredSize(CommanConstants.Taskfield_size);
        taskfield.setContentType("text/html");

        // checkbox
        checkBox= new JCheckBox();
        checkBox.setPreferredSize(CommanConstants.CheckBox_size);
        checkBox.addActionListener(this);
        // delete button
        deletebutton= new JButton("X");
        deletebutton.setPreferredSize(CommanConstants.DeleteButton_size);
        deletebutton.addActionListener(this);

        // parent pannel
//        parentpanel= new JPanel();
//        parentpanel.setPreferredSize(CommanConstants.ParentPanel_button);

        // add to this taskcomponet
        add(checkBox);
        add(taskfield);
        add(deletebutton);
        //add(parentpanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(checkBox.isSelected()){
            // replace all the html tags to empty string garb the main text
            String task= taskfield.getText().replaceAll("<[^>]*<","");

            // add strikethrough text
            taskfield.setText("<html><s>"+task+"</s></html>");
        }else if(!checkBox.isSelected()){
            String task= taskfield.getText().replaceAll("<[^>]*>","");

            taskfield.setText(task);
        }

        if(e.getActionCommand().equalsIgnoreCase("x")){
            // delete this componet from the parent panel
            parentpanel.remove(this);
            parentpanel.repaint();
            parentpanel.revalidate();
        }
    }
}
