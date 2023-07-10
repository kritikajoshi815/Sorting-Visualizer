import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Random;

import javax.swing.*;
import javax.swing.JPanel;

public class Panel extends JPanel implements ActionListener {
     

    Random random;
    int arr[];
    int delay;//speed of timer;

    String display=" ";


//Buttons
    JButton start;
    JButton bubble;
    JButton insertion;
    JButton selection;

//Labels
    JLabel label;
    JLabel labelComplex;

//Panels
    JPanel Code;
    JPanel Complexity;
    JPanel Working;

//Sorting   
    BubbleSort bs;
    InsertionSort is;
    SelectionSort ss;

//boolean
    boolean isBubble=false;
    boolean isInsertion=false;
    boolean isSelection=false;
    boolean isRunning=false;
  
//constructor
    public Panel(){
       random=new Random();
       arr=new int[47];
       this.setArray();

    //adding characteristics to panel
       this.setBounds(0,0,1500,1500);
       this.setLayout(null);
       this.setBackground(Color.black);

    //creating objects
       bs=new BubbleSort(this.arr,this.arr.length);
       is=new InsertionSort(this.arr,this.arr.length);
       ss=new SelectionSort(this.arr,this.arr.length);





//initializing buttons
       start=new JButton("Start");
       bubble=new JButton("Bubble");
       insertion=new JButton("Insertion");
       selection=new JButton("Selection");
    
//objects of Labels
       label=new JLabel();
       labelComplex=new JLabel();

//Panels characteristics

    //Code section
       Code=new JPanel();
       Code.setBounds(0,370,500,430);
       Code.setBackground(Color.black);

    //Complexity section
       Complexity=new JPanel();
       Complexity.setBounds(1200,390,300,150);
       Complexity.setBackground(Color.black);

    //Working
       Working =new JPanel();
       Working.setBounds(750,430,250,370);
       Working.setBackground(Color.black);

       //-----------------------------------start button------------------------

    //start button
       start.setFocusable(false);
       start.setBounds(500,15,100,20);
       start.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
        start.setBackground(Color.gray);
            animate();
         }});

//-----------------------------------end start button------------------------
 

       
//--------------------bubble sort-------------------------------
    //bubble button
       bubble.setFocusable(false);
       bubble.setBounds(620,15,100,20);
       bubble.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) { 
            
                if (isRunning == false) {
                    System.out.println("hi");
                    isBubble=true;
                    bubble.setBackground(Color.GRAY);

        //creating object of CodeFile
        CodeFile text=new CodeFile();
        //adding characteristic to label
        label.setForeground(Color.white);
        String formatted = text.getBubble().replace("\n", "<br>");
        formatted = "<html><font size='5'>" + formatted + "</font></html>";
        label.setText(formatted);
        //adding label to Code panel
        Code.add(label);


        //creating object of ComplexityFile
        ComplexityFile complex=new ComplexityFile();
        //adding characteristic to labelComplex
        labelComplex.setForeground(Color.white);
        String format = complex.getBubbleComplexity().replace("\n", "<br>");
        format = "<html><font size='5'>" + format + "</font></html>";
        //adding labelComplex to ComplexityFile
        labelComplex.setText(format);

        //adding panels to working when bubble is pressed
        Working.add(bs.motionPanelHeader);
        Working.add(bs.motionPanelArrayIndex);
        Working.add(bs.motionPanelCompareIndex);
        Working.add(bs.motionPanelMotionSwap);
                }
                
        }
        
    });
//--------------------end bubble sort-------------------------------

//--------------------insertion button-----------------
     insertion.setFocusable(false);
     insertion.setBounds(740,15,100,20);
     insertion.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) { 
            
                if (isRunning == false) {
                    isInsertion=true;
                    insertion.setBackground(Color.GRAY);
                    CodeFile text=new CodeFile();
        //adding characteristic to label
        label.setForeground(Color.white);
        String formatted = text.getInsertion().replace("\n", "<br>");
      //  formatted=text.getInsertion().replace(".", "&nbsp");
        formatted = "<html><font size='5'>" + formatted + "</font></html>";
        label.setText(formatted);
        //adding label to Code panel
        Code.add(label);
   
        //creating object of ComplexityFile
        ComplexityFile complex=new ComplexityFile();
        //adding characteristic to labelComplex
        labelComplex.setForeground(Color.white);
        String format = complex.getInsertionComplexity().replace("\n", "<br>");
        format = "<html><font size='5'>" + format + "</font></html>";
        //adding labelComplex to ComplexityFile
        labelComplex.setText(format);

       // adding panels to working when bubble is pressed
        Working.add(is.motionPanelHeader);
        Working.add(is.motionPanelArrayIndex);
        Working.add(is.motionPanelKey1);
        Working.add(is.motionPanelCompareIndex);
        Working.add(is.motionPanelKey2);

    }
                
}

});
//--------------------end insertion button-----------------

              
//--------------------selection sort-------------------------------
    selection.setFocusable(false);
    selection.setBounds(860,15,100,20);
    selection.addActionListener(new ActionListener() {
     @Override
     public void actionPerformed(ActionEvent e) { 
         
             if (isRunning == false) {
        
                 isSelection=true;
                 selection.setBackground(Color.GRAY);

     //creating object of CodeFile
     CodeFile text=new CodeFile();
     //adding characteristic to label
     label.setForeground(Color.white);
     String formatted = text.getSelection().replace("\n", "<br>");
     formatted = "<html><font size='5'>" + formatted + "</font></html>";
     label.setText(formatted);
     //adding label to Code panel
     Code.add(label);


     //creating object of ComplexityFile
     ComplexityFile complex=new ComplexityFile();
     //adding characteristic to labelComplex
     labelComplex.setForeground(Color.white);
     String format = complex.getSelectionComplexity().replace("\n", "<br>");
     format = "<html><font size='5'>" + format + "</font></html>";
     //adding labelComplex to ComplexityFile
     labelComplex.setText(format);

     //adding panels to working when bubble is pressed
     Working.add(ss.motionPanelHeader);
     Working.add(ss.motionPanelArrayIndex);
     Working.add(ss.motionPanelCompareIndex);
     Working.add(ss.motionPanelCompareIndexContents);
     Working.add(ss.motionPanelMotionSwap);

              }
             
     }
     
 });
        
//adding paenls to panel
       this.add(start);
       this.add(bubble);
       this.add(insertion);
       this.add(selection);
       this.add(Code);
       this.add(Complexity);
       this.add(Working);
       Code.add(label);
       Complexity.add(labelComplex);
       

    }

    void setArray(){
        int len=this.arr.length;
       for(int i=0; i<len; i++){
        this.arr[i]=random.nextInt(50,300);
       }
    }

    void animate(){
//---------------------------For bubble sort-----------------------------
        if (isBubble) {
            bs.setCompareIndex(0);
           
            Timer timer  = new Timer(500, new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (isSorted() && bs.arrayIndex==0) {
                        start.setBackground(Color.WHITE);
                        bubble.setBackground(Color.white);
                        //submit.setBackground(Color.WHITE);
                        ((Timer)e.getSource()).stop();
                        bs.setCompareIndex(Integer.MAX_VALUE);
                    } 
                    else {
                          display=  bs.compare();
                    }

                    repaint();
                }
            });

           timer.start();
        }
//--------------------end bubble sort-------------------------------



//--------------------insertion sort-------------------------------
if (isInsertion) {
    //is.setCompareIndex(0);
   
    Timer timer  = new Timer(500, new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
              int len=arr.length;
            //  System.out.println(isSorted()+" "+is.compare_index);
            if (isSorted() && is.array_index>=len) {
                start.setBackground(Color.WHITE);
               // submit.setBackground(Color.WHITE);
                insertion.setBackground(Color.white);
                ((Timer)e.getSource()).stop();
            } 
            else {
                  display=  is.compare();
            }

            repaint();
        }
    });

   timer.start();
}

//--------------------end insertion sort-------------------------------

//----------------------selection sort---------------------------
if (isSelection) {
          //  ss.setCompareIndex(0);
           
            Timer timer  = new Timer(500, new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {

                    if (isSorted()) {
                        start.setBackground(Color.WHITE);
                      //  submit.setBackground(Color.WHITE);
                        selection.setBackground(Color.white);
                        ((Timer)e.getSource()).stop();
                       // ss.setCompareIndex(Integer.MAX_VALUE);
                    } 
                    else {
                          display=  ss.compare();
                    }

                    repaint();
                }
            });

           timer.start();
        }
//--------------------end selection sort-------------------------------



    }

    

public void paintComponent(Graphics g){
    super.paintComponent(g);
    int len=this.arr.length;
    
    for(int i=0; i<len; i++){

//---------------------------For bubble sort-----------------------------
       if(isBubble==true){
        g.setFont(new Font("Calibri", Font.PLAIN, 25)); 
        g.setColor(Color.white) ; // Here
        g.drawString(display, 750, 390);
        if(i==bs.compareIndex){
            
            g.setFont(new Font("Calibri", Font.PLAIN, 25)); 
            g.setColor(Color.white) ; // Here
            g.drawString(display, 750, 390);
            g.setColor(Color.CYAN);
        }
    
   
    }
//--------------------end bubble sort-------------------------------



//--------------------insertion sort-------------------------------
if(isInsertion==true){
    g.setFont(new Font("Calibri", Font.PLAIN, 25)); 
g.setColor(Color.white) ; // Here
g.drawString(display, 750, 390);
    if( i==is.compare_index+1){
        g.setFont(new Font("Calibri", Font.PLAIN, 25)); 
        g.setColor(Color.white) ; // Here
        g.drawString(display, 750, 390);
        g.setColor(Color.CYAN);
    }
    if(i==is.array_index){
        g.setColor(Color.MAGENTA);
    }


}
//---------------end insertion sort-----------------------


//----------------selection sort-----------------------------
if(isSelection==true){
g.setFont(new Font("Calibri", Font.PLAIN, 25)); 
g.setColor(Color.white) ; // Here
g.drawString(display, 750, 390);
if(i==ss.min_idx){
    g.setFont(new Font("Calibri", Font.PLAIN, 25)); 
    g.setColor(Color.white) ; // Here
    g.drawString(display, 750, 390);
    g.setColor(Color.magenta);
}
if(i==ss.compare_index){
    g.setFont(new Font("Calibri", Font.PLAIN, 25)); 
    g.setColor(Color.white) ; // Here
    g.drawString(display, 750, 390);
    g.setColor(Color.cyan);
}
}

//--------------end selection sort--------------
    if (g.getColor() != Color.MAGENTA && g.getColor() != Color.CYAN && g.getColor() != Color.BLUE && g.getColor() != Color.RED)
                g.setColor(Color.orange);
    g.fillRect((i+1)*30, 350 - arr[i], 30, arr[i]);
    g.setColor(Color.BLACK);
    g.drawRect((i+1)*30, 350 - arr[i], 30, arr[i]); 
    
    g.setColor(Color.black);
    g.setFont(new Font(Font.SANS_SERIF,Font.BOLD,13));
    g.drawString(arr[i]+"",30*(i+1)+4,380-arr[i]);

}
}

public boolean isSorted() {

    for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] > arr[i + 1]) {
            return false; 
        }
    }

    return true;
}

@Override
public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
}
}