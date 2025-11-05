import java.awt.*;

public class CommanConstants {
    //frame config
    public static final Dimension  GUI_SIZE= new Dimension(540,760);

    // banner config
    public static final Dimension Banner_Size= new Dimension(GUI_SIZE.width,50);

    // task pannel config
    public static final Dimension TaskPannel_size= new Dimension(GUI_SIZE.width-30,GUI_SIZE.height-175);

    // task button config
    public static final Dimension TaskBUtton_size= new Dimension(GUI_SIZE.width,50);

    // taskcomponent configs
    public static final Dimension Taskfield_size= new Dimension((int)(TaskPannel_size.width*0.80),50);

    //checkbox config
    public  static final Dimension CheckBox_size= new Dimension((int)(Taskfield_size.width*0.05),50);

    // deletebutton config
    public static final Dimension DeleteButton_size = new Dimension((int)(Taskfield_size.width*0.12),50);

    // parentpannel config
    public static final Dimension ParentPanel_button = new Dimension((int)(Taskfield_size.width*0.09),50);
}

