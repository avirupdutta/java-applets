import java.awt.*;

public class MyGui {
    public static void main ( String[] args ) {
        new MyFrame();
    }
}

class MyFrame extends Frame{
    Label l, l1;
    public MyFrame(){
        setLayout(new FlowLayout());
        l = new Label("Hello");
        l1 = new Label("hi");
        add(l);
        add(l1);




        setVisible(true);
        setSize(400, 400);
    }
}
