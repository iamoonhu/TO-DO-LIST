import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class ToDoList  extends JFrame implements ActionListener {
    //taskpannel will act as conatiner for the taskcomponentpannel
    //taskcompentpannel will store the all task components

    private  JPanel taskpannel, taskcomponetpannel;
    public  ToDoList(){
        super("To Do List Application");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(CommanConstants.GUI_SIZE);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        addguicomponents();
    }
    private void addguicomponents(){
        // banner text
        JLabel bannerlabel= new JLabel("TO DO LIST");
        //bannerlabel.setFont();
        bannerlabel.setBounds(
                (CommanConstants.GUI_SIZE.width-bannerlabel.getPreferredSize().width)/2,
                15,
                CommanConstants.Banner_Size.width,
                CommanConstants.Banner_Size.height

        );
        // taskpannel
        taskpannel= new JPanel();

        //taskcoponentpannel
        taskcomponetpannel= new JPanel();
        taskcomponetpannel.setLayout(new BoxLayout(taskcomponetpannel,BoxLayout.Y_AXIS));
        taskpannel.add(taskcomponetpannel);

        // add scrolling to the task panel
        JScrollPane scrollpane= new JScrollPane(taskpannel);
        scrollpane.setBounds(8,70,CommanConstants.TaskPannel_size.width,CommanConstants.TaskPannel_size.height);
        scrollpane.setMaximumSize(CommanConstants.TaskPannel_size);
        scrollpane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollpane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        // add task button
        JButton addtaskbutton = new JButton("Add Task");
        addtaskbutton.setBounds(-5,CommanConstants.GUI_SIZE.height-88,CommanConstants.TaskBUtton_size.width,CommanConstants.TaskBUtton_size.height);
        addtaskbutton.setMaximumSize(CommanConstants.TaskBUtton_size);
        addtaskbutton.addActionListener(this );


        // add to frame
        this.getContentPane().add(bannerlabel);
        this.getContentPane().add(scrollpane);
        this.getContentPane().add(addtaskbutton);

    }
    private  Font createFont(String resource, float size){
        // get the font file path
        String filepath= getClass().getClassLoader().getResource(resource).getPath().replaceAll("%20"," ");

        //check to see if the path contains a foldder with spaces in them
        if(filepath.contains("%20")){
            filepath=getClass().getClassLoader().getResource(resource).getPath();
        }

        //create font
        try{
            File customfile= new File(filepath);
            Font customfont = Font.createFont(Font.TRUETYPE_FONT,customfile).deriveFont(size);
            return  customfont;
        }catch (Exception e){
            System.out.println("Error:"+e);
        }
        return  null;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if(command.equalsIgnoreCase("add task")){
            // create a task componet
            TaskComponant taskComponant= new TaskComponant(taskcomponetpannel);
            taskcomponetpannel.add(taskComponant);

            // make the task field request focus after creation
            taskComponant.getTaskfield().requestFocus();
            repaint();
            revalidate();
        }
    }
}
