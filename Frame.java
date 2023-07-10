import javax.swing.JFrame;
class Frame extends JFrame {
    Panel panel=new Panel();
    Frame(){
        this.setSize(1500,1000);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
       
    }
    
}